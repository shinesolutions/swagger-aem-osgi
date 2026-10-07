package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteAuthOauthImplGraniteProviderProperties {
    
    ConfigNodePropertyString oauthProviderId
    
    ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl
    
    ConfigNodePropertyString oauthProviderGraniteTokenUrl
    
    ConfigNodePropertyString oauthProviderGraniteProfileUrl
    
    ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls
}
