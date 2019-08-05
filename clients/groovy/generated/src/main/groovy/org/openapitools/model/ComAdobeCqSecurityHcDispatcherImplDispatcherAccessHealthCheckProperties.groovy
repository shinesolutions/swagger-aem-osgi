package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties {
    ConfigNodePropertyArray hcTags = null

    ConfigNodePropertyString dispatcherAddress = null

    ConfigNodePropertyArray dispatcherFilterAllowed = null

    ConfigNodePropertyArray dispatcherFilterBlocked = null

}
