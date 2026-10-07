namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthImsImplIMSProviderImplProperties =

  //#region ComAdobeGraniteAuthImsImplIMSProviderImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthImsImplIMSProviderImplProperties = {
    [<JsonProperty(PropertyName = "oauth.provider.id")>]
    OauthProviderId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.ims.authorization.url")>]
    OauthProviderImsAuthorizationUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.ims.token.url")>]
    OauthProviderImsTokenUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.ims.profile.url")>]
    OauthProviderImsProfileUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.ims.extended.details.urls")>]
    OauthProviderImsExtendedDetailsUrls : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "oauth.provider.ims.validate.token.url")>]
    OauthProviderImsValidateTokenUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.ims.session.property")>]
    OauthProviderImsSessionProperty : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.ims.service.token.client.id")>]
    OauthProviderImsServiceTokenClientId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.ims.service.token.client.secret")>]
    OauthProviderImsServiceTokenClientSecret : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.ims.service.token")>]
    OauthProviderImsServiceToken : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "ims.org.ref")>]
    ImsOrgRef : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "ims.group.mapping")>]
    ImsGroupMapping : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "oauth.provider.ims.only.license.group")>]
    OauthProviderImsOnlyLicenseGroup : ConfigNodePropertyBoolean;
  }

  //#endregion
