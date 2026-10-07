package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {
    
    ConfigNodePropertyString path
    
    ConfigNodePropertyInteger serviceRanking
    
    ConfigNodePropertyString jaasControlFlag
    
    ConfigNodePropertyString jaasRealmName
    
    ConfigNodePropertyInteger jaasRanking
    
    ConfigNodePropertyArray headers
    
    ConfigNodePropertyArray cookies
    
    ConfigNodePropertyArray parameters
    
    ConfigNodePropertyArray usermap
    
    ConfigNodePropertyString format
    
    ConfigNodePropertyString trustedCredentialsAttribute
}
