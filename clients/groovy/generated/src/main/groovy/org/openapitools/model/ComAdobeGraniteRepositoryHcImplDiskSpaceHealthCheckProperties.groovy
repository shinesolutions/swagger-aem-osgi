package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {
    ConfigNodePropertyArray hcTags = null

    ConfigNodePropertyInteger diskSpaceWarnThreshold = null

    ConfigNodePropertyInteger diskSpaceErrorThreshold = null

}