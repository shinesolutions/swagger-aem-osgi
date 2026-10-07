namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamHandlerStandardPsdPsdHandlerProperties =

  //#region ComDayCqDamHandlerStandardPsdPsdHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamHandlerStandardPsdPsdHandlerProperties = {
    [<JsonProperty(PropertyName = "large_file_threshold")>]
    LargeFileThreshold : ConfigNodePropertyInteger;
  }

  //#endregion
