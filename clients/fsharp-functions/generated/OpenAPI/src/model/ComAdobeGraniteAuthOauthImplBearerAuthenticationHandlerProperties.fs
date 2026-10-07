namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties =

  //#region ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.clientIds.allowed")>]
    OauthClientIdsAllowed : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "auth.bearer.sync.ims")>]
    AuthBearerSyncIms : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "auth.tokenRequestParameter")>]
    AuthTokenRequestParameter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.bearer.configid")>]
    OauthBearerConfigid : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.jwt.support")>]
    OauthJwtSupport : ConfigNodePropertyBoolean;
  }

  //#endregion
