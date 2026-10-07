namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties =

  //#region ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties = {
    [<JsonProperty(PropertyName = "sling.post.operation")>]
    SlingPostOperation : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.methods")>]
    SlingServletMethods : ConfigNodePropertyString;
  }

  //#endregion
