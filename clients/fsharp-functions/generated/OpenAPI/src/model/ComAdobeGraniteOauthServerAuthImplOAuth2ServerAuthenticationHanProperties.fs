namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties =

  //#region ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jaas.controlFlag")>]
    JaasControlFlag : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jaas.realmName")>]
    JaasRealmName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jaas.ranking")>]
    JaasRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "oauth.offline.validation")>]
    OauthOfflineValidation : ConfigNodePropertyBoolean;
  }

  //#endregion
