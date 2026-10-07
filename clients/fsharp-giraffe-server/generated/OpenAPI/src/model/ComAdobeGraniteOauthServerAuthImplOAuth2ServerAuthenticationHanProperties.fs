namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties =

  //#region ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties


  type comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties = {
    Path : ConfigNodePropertyString;
    JaasControlFlag : ConfigNodePropertyString;
    JaasRealmName : ConfigNodePropertyString;
    JaasRanking : ConfigNodePropertyInteger;
    OauthOfflineValidation : ConfigNodePropertyBoolean;
  }
  //#endregion
