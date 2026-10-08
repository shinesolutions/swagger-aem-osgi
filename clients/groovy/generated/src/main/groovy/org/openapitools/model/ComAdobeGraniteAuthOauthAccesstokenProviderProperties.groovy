package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteAuthOauthAccesstokenProviderProperties {
    
    ConfigNodePropertyString name
    
    ConfigNodePropertyString authTokenProviderTitle
    
    ConfigNodePropertyArray authTokenProviderDefaultClaims
    
    ConfigNodePropertyString authTokenProviderEndpoint
    
    ConfigNodePropertyString authAccessTokenRequest
    
    ConfigNodePropertyString authTokenProviderKeypairAlias
    
    ConfigNodePropertyInteger authTokenProviderConnTimeout
    
    ConfigNodePropertyInteger authTokenProviderSoTimeout
    
    ConfigNodePropertyString authTokenProviderClientId
    
    ConfigNodePropertyString authTokenProviderScope
    
    ConfigNodePropertyBoolean authTokenProviderReuseAccessToken
    
    ConfigNodePropertyBoolean authTokenProviderRelaxedSsl
    
    ConfigNodePropertyString tokenRequestCustomizerType
    
    ConfigNodePropertyString authTokenValidatorType
}
