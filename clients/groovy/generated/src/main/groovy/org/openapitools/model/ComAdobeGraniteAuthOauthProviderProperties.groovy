package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteAuthOauthProviderProperties {
    
    ConfigNodePropertyString oauthConfigId
    
    ConfigNodePropertyString oauthClientId
    
    ConfigNodePropertyString oauthClientSecret
    
    ConfigNodePropertyArray oauthScope
    
    ConfigNodePropertyString oauthConfigProviderId
    
    ConfigNodePropertyBoolean oauthCreateUsers
    
    ConfigNodePropertyString oauthUseridProperty
    
    ConfigNodePropertyBoolean forceStrictUsernameMatching
    
    ConfigNodePropertyBoolean oauthEncodeUserids
    
    ConfigNodePropertyBoolean oauthHashUserids
    
    ConfigNodePropertyString oauthCallBackUrl
    
    ConfigNodePropertyBoolean oauthAccessTokenPersist
    
    ConfigNodePropertyBoolean oauthAccessTokenPersistCookie
    
    ConfigNodePropertyBoolean oauthCsrfStateProtection
    
    ConfigNodePropertyBoolean oauthRedirectRequestParams
    
    ConfigNodePropertyBoolean oauthConfigSiblingsAllow
}
