namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthAccesstokenProviderProperties =

  //#region ComAdobeGraniteAuthOauthAccesstokenProviderProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthAccesstokenProviderProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.token.provider.title")>]
    AuthTokenProviderTitle : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.token.provider.default.claims")>]
    AuthTokenProviderDefaultClaims : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "auth.token.provider.endpoint")>]
    AuthTokenProviderEndpoint : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.access.token.request")>]
    AuthAccessTokenRequest : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.token.provider.keypair.alias")>]
    AuthTokenProviderKeypairAlias : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.token.provider.conn.timeout")>]
    AuthTokenProviderConnTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "auth.token.provider.so.timeout")>]
    AuthTokenProviderSoTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "auth.token.provider.client.id")>]
    AuthTokenProviderClientId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.token.provider.scope")>]
    AuthTokenProviderScope : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.token.provider.reuse.access.token")>]
    AuthTokenProviderReuseAccessToken : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "auth.token.provider.relaxed.ssl")>]
    AuthTokenProviderRelaxedSsl : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "token.request.customizer.type")>]
    TokenRequestCustomizerType : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.token.validator.type")>]
    AuthTokenValidatorType : ConfigNodePropertyString;
  }

  //#endregion
