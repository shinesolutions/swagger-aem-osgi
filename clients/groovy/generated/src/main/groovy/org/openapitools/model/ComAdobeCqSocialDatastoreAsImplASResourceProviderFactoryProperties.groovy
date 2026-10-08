package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties {
    
    ConfigNodePropertyString versionId
    
    ConfigNodePropertyBoolean cacheOn
    
    ConfigNodePropertyInteger concurrencyLevel
    
    ConfigNodePropertyInteger cacheStartSize
    
    ConfigNodePropertyInteger cacheTtl
    
    ConfigNodePropertyInteger cacheSize
    
    ConfigNodePropertyInteger timeLimit
}
