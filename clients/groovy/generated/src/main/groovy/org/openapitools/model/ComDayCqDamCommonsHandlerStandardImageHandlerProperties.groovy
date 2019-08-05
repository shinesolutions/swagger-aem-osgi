package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqDamCommonsHandlerStandardImageHandlerProperties {
    ConfigNodePropertyInteger largeFileThreshold = null

    ConfigNodePropertyInteger largeCommentThreshold = null

    ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction = null

}
