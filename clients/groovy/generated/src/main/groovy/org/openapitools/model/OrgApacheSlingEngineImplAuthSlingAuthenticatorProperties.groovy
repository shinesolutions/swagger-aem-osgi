package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {
    
    ConfigNodePropertyString osgiHttpWhiteboardContextSelect
    
    ConfigNodePropertyString osgiHttpWhiteboardListener
    
    ConfigNodePropertyString authSudoCookie
    
    ConfigNodePropertyString authSudoParameter
    
    ConfigNodePropertyBoolean authAnnonymous
    
    ConfigNodePropertyArray slingAuthRequirements
    
    ConfigNodePropertyString slingAuthAnonymousUser
    
    ConfigNodePropertyString slingAuthAnonymousPassword
    
    ConfigNodePropertyDropDown authHttp
    
    ConfigNodePropertyString authHttpRealm
    
    ConfigNodePropertyArray authUriSuffix
}
