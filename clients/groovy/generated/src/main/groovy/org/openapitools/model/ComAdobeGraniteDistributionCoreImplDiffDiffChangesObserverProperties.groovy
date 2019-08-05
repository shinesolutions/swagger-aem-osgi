package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties {
    ConfigNodePropertyBoolean enabled = null

    ConfigNodePropertyString agentName = null

    ConfigNodePropertyString diffPath = null

    ConfigNodePropertyString observedPath = null

    ConfigNodePropertyString serviceName = null

    ConfigNodePropertyString propertyNames = null

    ConfigNodePropertyInteger distributionDelay = null

    ConfigNodePropertyString serviceUserTarget = null

}
