namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties =

  //#region ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties

  [<CLIMutable>]
  type ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.paths")>]
    SlingServletPaths : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.methods")>]
    SlingServletMethods : ConfigNodePropertyString;
  }

  //#endregion
