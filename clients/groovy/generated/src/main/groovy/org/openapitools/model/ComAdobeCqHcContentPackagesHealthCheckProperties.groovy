package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqHcContentPackagesHealthCheckProperties {
    ConfigNodePropertyString hcName = null

    ConfigNodePropertyArray hcTags = null

    ConfigNodePropertyString hcMbeanName = null

    ConfigNodePropertyArray packageNames = null

}
