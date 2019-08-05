package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

@Canonical
class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {
    ConfigNodePropertyBoolean xmpFilterApplyWhitelist = null

    ConfigNodePropertyArray xmpFilterWhitelist = null

    ConfigNodePropertyBoolean xmpFilterApplyBlacklist = null

    ConfigNodePropertyArray xmpFilterBlacklist = null

}
