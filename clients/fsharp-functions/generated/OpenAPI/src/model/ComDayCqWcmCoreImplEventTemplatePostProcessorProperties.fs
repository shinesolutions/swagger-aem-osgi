namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplEventTemplatePostProcessorProperties =

  //#region ComDayCqWcmCoreImplEventTemplatePostProcessorProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplEventTemplatePostProcessorProperties = {
    [<JsonProperty(PropertyName = "paths")>]
    Paths : ConfigNodePropertyString;
  }

  //#endregion
