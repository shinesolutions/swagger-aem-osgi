namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthProviderProperties =

  //#region ComAdobeGraniteAuthOauthProviderProperties


  type comAdobeGraniteAuthOauthProviderProperties = {
    OauthConfigId : ConfigNodePropertyString;
    OauthClientId : ConfigNodePropertyString;
    OauthClientSecret : ConfigNodePropertyString;
    OauthScope : ConfigNodePropertyArray;
    OauthConfigProviderId : ConfigNodePropertyString;
    OauthCreateUsers : ConfigNodePropertyBoolean;
    OauthUseridProperty : ConfigNodePropertyString;
    ForceStrictUsernameMatching : ConfigNodePropertyBoolean;
    OauthEncodeUserids : ConfigNodePropertyBoolean;
    OauthHashUserids : ConfigNodePropertyBoolean;
    OauthCallBackUrl : ConfigNodePropertyString;
    OauthAccessTokenPersist : ConfigNodePropertyBoolean;
    OauthAccessTokenPersistCookie : ConfigNodePropertyBoolean;
    OauthCsrfStateProtection : ConfigNodePropertyBoolean;
    OauthRedirectRequestParams : ConfigNodePropertyBoolean;
    OauthConfigSiblingsAllow : ConfigNodePropertyBoolean;
  }
  //#endregion
