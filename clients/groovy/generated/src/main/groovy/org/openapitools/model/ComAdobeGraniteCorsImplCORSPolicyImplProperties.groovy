package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComAdobeGraniteCorsImplCORSPolicyImplProperties {
    
    ConfigNodePropertyArray alloworigin
    
    ConfigNodePropertyArray alloworiginregexp
    
    ConfigNodePropertyArray allowedpaths
    
    ConfigNodePropertyArray exposedheaders
    
    ConfigNodePropertyInteger maxage
    
    ConfigNodePropertyArray supportedheaders
    
    ConfigNodePropertyArray supportedmethods
    
    ConfigNodePropertyBoolean supportscredentials
}
