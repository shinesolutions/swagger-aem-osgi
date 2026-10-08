package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties {
    
    ConfigNodePropertyString oauthProviderId
    
    ConfigNodePropertyString oauthCloudConfigRoot
    
    ConfigNodePropertyString providerConfigRoot
    
    ConfigNodePropertyBoolean providerConfigCreateTagsEnabled
    
    ConfigNodePropertyDropDown providerConfigUserFolder
    
    ConfigNodePropertyBoolean providerConfigFacebookFetchFields
    
    ConfigNodePropertyArray providerConfigFacebookFields
    
    ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled
}
