package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteAuthImsImplIMSProviderImplProperties {
    
    ConfigNodePropertyString oauthProviderId
    
    ConfigNodePropertyString oauthProviderImsAuthorizationUrl
    
    ConfigNodePropertyString oauthProviderImsTokenUrl
    
    ConfigNodePropertyString oauthProviderImsProfileUrl
    
    ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls
    
    ConfigNodePropertyString oauthProviderImsValidateTokenUrl
    
    ConfigNodePropertyString oauthProviderImsSessionProperty
    
    ConfigNodePropertyString oauthProviderImsServiceTokenClientId
    
    ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret
    
    ConfigNodePropertyString oauthProviderImsServiceToken
    
    ConfigNodePropertyString imsOrgRef
    
    ConfigNodePropertyArray imsGroupMapping
    
    ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup
}
