namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties =

  //#region ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties = {
    [<JsonProperty(PropertyName = "sling.post.operation")>]
    SlingPostOperation : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.methods")>]
    SlingServletMethods : ConfigNodePropertyString;
  }

  //#endregion
