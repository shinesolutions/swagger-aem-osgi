namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmScriptingImplBVPManagerProperties =

  //#region ComDayCqWcmScriptingImplBVPManagerProperties

  [<CLIMutable>]
  type ComDayCqWcmScriptingImplBVPManagerProperties = {
    [<JsonProperty(PropertyName = "com.day.cq.wcm.scripting.bvp.script.engines")>]
    ComDayCqWcmScriptingBvpScriptEngines : ConfigNodePropertyArray;
  }

  //#endregion
