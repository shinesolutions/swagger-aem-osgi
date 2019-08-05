package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteMonitoringImplScriptConfigImplProperties {
    ConfigNodePropertyString scriptFilename = null

    ConfigNodePropertyString scriptDisplay = null

    ConfigNodePropertyString scriptPath = null

    ConfigNodePropertyArray scriptPlatform = null

    ConfigNodePropertyInteger interval = null

    ConfigNodePropertyString jmxdomain = null

}
