package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {
    ConfigNodePropertyString defaultTransportAgentToWorkerPrefix = null

    ConfigNodePropertyString defaultTransportAgentToMasterPrefix = null

    ConfigNodePropertyString defaultTransportInputPackage = null

    ConfigNodePropertyString defaultTransportOutputPackage = null

    ConfigNodePropertyBoolean defaultTransportReplicationSynchronous = null

    ConfigNodePropertyBoolean defaultTransportContentpackage = null

    ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled = null

}
