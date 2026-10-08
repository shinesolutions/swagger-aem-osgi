namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties =

  //#region ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties

  [<CLIMutable>]
  type ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties = {
    [<JsonProperty(PropertyName = "nuiEnabled")>]
    NuiEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "nuiServiceUrl")>]
    NuiServiceUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "nuiApiKey")>]
    NuiApiKey : ConfigNodePropertyString;
  }

  //#endregion
