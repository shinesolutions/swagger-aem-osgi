namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties =

  //#region ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties = {
    [<JsonProperty(PropertyName = "process.label")>]
    ProcessLabel : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "extract.pages")>]
    ExtractPages : ConfigNodePropertyBoolean;
  }

  //#endregion
