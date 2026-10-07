namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties =

  //#region ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties

  [<CLIMutable>]
  type ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "token.required.attr")>]
    TokenRequiredAttr : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "token.alternate.url")>]
    TokenAlternateUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "token.encapsulated")>]
    TokenEncapsulated : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "skip.token.refresh")>]
    SkipTokenRefresh : ConfigNodePropertyArray;
  }

  //#endregion
