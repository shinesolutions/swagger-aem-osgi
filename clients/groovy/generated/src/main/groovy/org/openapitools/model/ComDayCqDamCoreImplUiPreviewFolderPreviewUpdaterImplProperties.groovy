package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties {
    ConfigNodePropertyBoolean createPreviewEnabled = null

    ConfigNodePropertyBoolean updatePreviewEnabled = null

    ConfigNodePropertyInteger queueSize = null

    ConfigNodePropertyString folderPreviewRenditionRegex = null

}
