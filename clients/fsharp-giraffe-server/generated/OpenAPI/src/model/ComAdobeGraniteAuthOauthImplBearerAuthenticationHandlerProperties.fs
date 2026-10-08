namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties =

  //#region ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties


  type comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties = {
    Path : ConfigNodePropertyString;
    OauthClientIdsAllowed : ConfigNodePropertyArray;
    AuthBearerSyncIms : ConfigNodePropertyBoolean;
    AuthTokenRequestParameter : ConfigNodePropertyString;
    OauthBearerConfigid : ConfigNodePropertyString;
    OauthJwtSupport : ConfigNodePropertyBoolean;
  }
  //#endregion
