namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties =

  //#region ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties

  [<CLIMutable>]
  type ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties = {
    [<JsonProperty(PropertyName = "name.whitelist")>]
    NameWhitelist : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "allow.expressions")>]
    AllowExpressions : ConfigNodePropertyBoolean;
  }

  //#endregion
