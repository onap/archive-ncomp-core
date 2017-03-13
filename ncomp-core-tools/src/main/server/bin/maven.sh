#!/bin/bash
set -v

( cd git/org.openecomp.ncomp.utils/ncomp-utils-java ; mvn clean install) || exit 1
( cd git/org.openecomp.ncomp.maven/ncomp-maven-xcore ; mvn clean install) || exit 1
( cd git/org.openecomp.ncomp.core/ncomp-core ; mvn clean install) || exit 1

(cd git/org.openecomp.ncomp.sirius.manager/ncomp-sirius-manager/ ; mvn clean install) || exit 1

( cd git/org.openecomp.ncomp.maven/ncomp-maven ; mvn clean install) || exit 1

## DCAE components
(cd git/org.openecomp.ncomp.dcae.store.timeseries/ncomp-dcae-store-timeseries/ ; mvn clean install) || exit 1
(cd git/org.openecomp.ncomp.dcae.store.timeseries/ncomp-dcae-messaging/ ; mvn clean install) || exit 1

## the rest need some cleanup
(cd git/org.openecomp.ncomp.openstack/ncomp-openstack-model/ ; mvn clean install) || exit 1
(cd git/org.openecomp.ncomp.openstack/ncomp-openstack-controller/ ; mvn clean install) || exit 1

(cd git/org.openecomp.ncomp.vpnondemand/ncomp-vpn-on-demand-model/ ; mvn clean install) || exit 1
(cd git/org.openecomp.ncomp.vpnondemand/ncomp-vpn-on-demand-router/ ; mvn clean install) || exit 1
(cd git/org.openecomp.ncomp.vpnondemand/ncomp-vpn-on-demand-network/ ; mvn clean install) || exit 1
(cd git/org.openecomp.ncomp.vpnondemand/ncomp-vpn-on-demand-controller/ ; mvn clean install) || exit 1
bin/ncomp-tool install-sirius-controller org.openecomp.ncomp.vpnondemand ncomp-vpn-on-demand-controller 31111 || exit 1
## fix makefile
sed -i s/vpn-on-demand-controller-controller/vpn-controller-controller/ controllers/ncomp-vpn-on-demand-controller/makefile

(cd git/org.openecomp.ncomp.clsqm/ncomp-clsqm-demo-model ; mvn clean install) || exit 1
(cd git/org.openecomp.ncomp.clsqm/ncomp-clsqm-demo-enodeb ; mvn clean install) || exit 1
(cd git/org.openecomp.ncomp.clsqm/ncomp-clsqm-demo-service ; mvn clean install) || exit 1
bin/ncomp-tool install-sirius-controller org.openecomp.ncomp.clsqm ncomp-clsqm-demo-service 5112 || exit 1


## ODL


## stopping ODL controller since it uses to much memory for the build to work
if [ -e controllers/odl/bvc/bin/stop ]; then controllers/odl/bvc/bin/stop || exit 1; fi

(cd git/org.openecomp.ncomp.sirius.manager/ncomp-sirius-manager-odl-runtime/ ; mvn clean install) || exit 1
(cd git/org.openecomp.ncomp.vpnondemand/ncomp-vpn-on-demand-network-odl/ ; mvn clean install) || exit 1
(cd git/org.openecomp.ncomp.clsqm/ncomp-clsqm-demo-enodeb-odl ; mvn clean install) || exit 1

bin/ncomp-tool install-odl-controller || exit 1
bin/ncomp-tool install-odl-plugin org.openecomp.ncomp.vpnondemand ncomp-vpn-on-demand-network-odl vpn-on-demand-network || exit 1
bin/ncomp-tool install-odl-plugin org.openecomp.ncomp.clsqm ncomp-clsqm-demo-enodeb-odl clsqm-demo-enodeb || exit 1


