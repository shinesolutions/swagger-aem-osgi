namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqTaggingImplJcrTagManagerFactoryImplProperties =

  //#region ComDayCqTaggingImplJcrTagManagerFactoryImplProperties

  [<CLIMutable>]
  type ComDayCqTaggingImplJcrTagManagerFactoryImplProperties = {
    [<JsonProperty(PropertyName = "validation.enabled")>]
    ValidationEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
