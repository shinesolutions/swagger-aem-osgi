package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComAdobeOctopusNcommBootstrapProperties {
    ConfigNodePropertyInteger maxConnections = null

    ConfigNodePropertyInteger maxRequests = null

    ConfigNodePropertyInteger requestTimeout = null

    ConfigNodePropertyInteger requestRetries = null

    ConfigNodePropertyInteger launchTimeout = null

}
