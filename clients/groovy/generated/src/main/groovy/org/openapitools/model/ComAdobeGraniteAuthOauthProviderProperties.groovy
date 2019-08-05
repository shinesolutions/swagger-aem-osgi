package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteAuthOauthProviderProperties {
    ConfigNodePropertyString oauthConfigId = null

    ConfigNodePropertyString oauthClientId = null

    ConfigNodePropertyString oauthClientSecret = null

    ConfigNodePropertyArray oauthScope = null

    ConfigNodePropertyString oauthConfigProviderId = null

    ConfigNodePropertyBoolean oauthCreateUsers = null

    ConfigNodePropertyString oauthUseridProperty = null

    ConfigNodePropertyBoolean forceStrictUsernameMatching = null

    ConfigNodePropertyBoolean oauthEncodeUserids = null

    ConfigNodePropertyBoolean oauthHashUserids = null

    ConfigNodePropertyString oauthCallBackUrl = null

    ConfigNodePropertyBoolean oauthAccessTokenPersist = null

    ConfigNodePropertyBoolean oauthAccessTokenPersistCookie = null

    ConfigNodePropertyBoolean oauthCsrfStateProtection = null

    ConfigNodePropertyBoolean oauthRedirectRequestParams = null

    ConfigNodePropertyBoolean oauthConfigSiblingsAllow = null

}
