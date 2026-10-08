namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties =

  //#region ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties = {
    [<JsonProperty(PropertyName = "guessTotal")>]
    GuessTotal : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "tagTitleSearch")>]
    TagTitleSearch : ConfigNodePropertyBoolean;
  }

  //#endregion
