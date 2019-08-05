package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {
    ConfigNodePropertyDropDown translateLanguage = null

    ConfigNodePropertyDropDown translateDisplay = null

    ConfigNodePropertyBoolean translateAttribution = null

    ConfigNodePropertyDropDown translateCaching = null

    ConfigNodePropertyDropDown translateSmartRendering = null

    ConfigNodePropertyString translateCachingDuration = null

    ConfigNodePropertyString translateSessionSaveInterval = null

    ConfigNodePropertyString translateSessionSaveBatchLimit = null

}
