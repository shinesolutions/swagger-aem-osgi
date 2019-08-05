package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {
    ConfigNodePropertyBoolean showPlaceholder = null

    ConfigNodePropertyInteger maximumCacheEntries = null

    ConfigNodePropertyDropDown afScriptingCompatversion = null

    ConfigNodePropertyBoolean makeFileNameUnique = null

    ConfigNodePropertyBoolean generatingCompliantData = null

}
