namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmCoreImplEventPagePostProcessorProperties =

  //#region ComDayCqWcmCoreImplEventPagePostProcessorProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplEventPagePostProcessorProperties = {
    [<JsonProperty(PropertyName = "paths")>]
    Paths : ConfigNodePropertyArray;
  }

  //#endregion
