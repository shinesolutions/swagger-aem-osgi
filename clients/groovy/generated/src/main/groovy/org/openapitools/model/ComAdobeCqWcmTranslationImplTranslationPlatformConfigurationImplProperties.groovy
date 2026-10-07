package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {
    
    ConfigNodePropertyString syncTranslationStateSchedulingFormat
    
    ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat
    
    ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes
    
    ConfigNodePropertyDropDown exportFormat
}
