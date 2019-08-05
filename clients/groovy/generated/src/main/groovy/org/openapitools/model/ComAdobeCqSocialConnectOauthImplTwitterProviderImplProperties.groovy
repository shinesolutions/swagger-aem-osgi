package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {
    ConfigNodePropertyString oauthProviderId = null

    ConfigNodePropertyString oauthCloudConfigRoot = null

    ConfigNodePropertyString providerConfigRoot = null

    ConfigNodePropertyDropDown providerConfigUserFolder = null

    ConfigNodePropertyBoolean providerConfigTwitterEnableParams = null

    ConfigNodePropertyArray providerConfigTwitterParams = null

    ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled = null

}
