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
    ConfigNodePropertyString name = null

    ConfigNodePropertyString authTokenProviderTitle = null

    ConfigNodePropertyArray authTokenProviderDefaultClaims = null

    ConfigNodePropertyString authTokenProviderEndpoint = null

    ConfigNodePropertyString authAccessTokenRequest = null

    ConfigNodePropertyString authTokenProviderKeypairAlias = null

    ConfigNodePropertyInteger authTokenProviderConnTimeout = null

    ConfigNodePropertyInteger authTokenProviderSoTimeout = null

    ConfigNodePropertyString authTokenProviderClientId = null

    ConfigNodePropertyString authTokenProviderScope = null

    ConfigNodePropertyBoolean authTokenProviderReuseAccessToken = null

    ConfigNodePropertyBoolean authTokenProviderRelaxedSsl = null

    ConfigNodePropertyString tokenRequestCustomizerType = null

    ConfigNodePropertyString authTokenValidatorType = null

}
