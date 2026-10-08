namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthAccesstokenProviderProperties =

  //#region ComAdobeGraniteAuthOauthAccesstokenProviderProperties


  type comAdobeGraniteAuthOauthAccesstokenProviderProperties = {
    Name : ConfigNodePropertyString;
    AuthTokenProviderTitle : ConfigNodePropertyString;
    AuthTokenProviderDefaultClaims : ConfigNodePropertyArray;
    AuthTokenProviderEndpoint : ConfigNodePropertyString;
    AuthAccessTokenRequest : ConfigNodePropertyString;
    AuthTokenProviderKeypairAlias : ConfigNodePropertyString;
    AuthTokenProviderConnTimeout : ConfigNodePropertyInteger;
    AuthTokenProviderSoTimeout : ConfigNodePropertyInteger;
    AuthTokenProviderClientId : ConfigNodePropertyString;
    AuthTokenProviderScope : ConfigNodePropertyString;
    AuthTokenProviderReuseAccessToken : ConfigNodePropertyBoolean;
    AuthTokenProviderRelaxedSsl : ConfigNodePropertyBoolean;
    TokenRequestCustomizerType : ConfigNodePropertyString;
    AuthTokenValidatorType : ConfigNodePropertyString;
  }
  //#endregion
