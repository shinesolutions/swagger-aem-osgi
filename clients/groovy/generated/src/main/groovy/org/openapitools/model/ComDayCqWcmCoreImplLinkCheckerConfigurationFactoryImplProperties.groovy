package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {
    
    ConfigNodePropertyString linkExpiredPrefix
    
    ConfigNodePropertyBoolean linkExpiredRemove
    
    ConfigNodePropertyString linkExpiredSuffix
    
    ConfigNodePropertyString linkInvalidPrefix
    
    ConfigNodePropertyBoolean linkInvalidRemove
    
    ConfigNodePropertyString linkInvalidSuffix
    
    ConfigNodePropertyString linkPredatedPrefix
    
    ConfigNodePropertyBoolean linkPredatedRemove
    
    ConfigNodePropertyString linkPredatedSuffix
    
    ConfigNodePropertyArray linkWcmmodes
}
