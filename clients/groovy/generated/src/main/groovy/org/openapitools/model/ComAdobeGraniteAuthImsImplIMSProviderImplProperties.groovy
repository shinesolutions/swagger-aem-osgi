package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteAuthImsImplIMSProviderImplProperties {
    ConfigNodePropertyString oauthProviderId = null

    ConfigNodePropertyString oauthProviderImsAuthorizationUrl = null

    ConfigNodePropertyString oauthProviderImsTokenUrl = null

    ConfigNodePropertyString oauthProviderImsProfileUrl = null

    ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls = null

    ConfigNodePropertyString oauthProviderImsValidateTokenUrl = null

    ConfigNodePropertyString oauthProviderImsSessionProperty = null

    ConfigNodePropertyString oauthProviderImsServiceTokenClientId = null

    ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret = null

    ConfigNodePropertyString oauthProviderImsServiceToken = null

    ConfigNodePropertyString imsOrgRef = null

    ConfigNodePropertyArray imsGroupMapping = null

    ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup = null

}
