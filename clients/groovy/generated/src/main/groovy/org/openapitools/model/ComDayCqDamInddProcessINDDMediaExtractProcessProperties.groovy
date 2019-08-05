package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqDamInddProcessINDDMediaExtractProcessProperties {
    ConfigNodePropertyString processLabel = null

    ConfigNodePropertyString cqDamInddPagesRegex = null

    ConfigNodePropertyBoolean idsJobDecoupled = null

    ConfigNodePropertyString idsJobWorkflowModel = null

}
