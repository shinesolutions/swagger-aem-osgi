package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {
    
    ConfigNodePropertyDropDown translateLanguage
    
    ConfigNodePropertyDropDown translateDisplay
    
    ConfigNodePropertyBoolean translateAttribution
    
    ConfigNodePropertyDropDown translateCaching
    
    ConfigNodePropertyDropDown translateSmartRendering
    
    ConfigNodePropertyString translateCachingDuration
    
    ConfigNodePropertyString translateSessionSaveInterval
    
    ConfigNodePropertyString translateSessionSaveBatchLimit
}
