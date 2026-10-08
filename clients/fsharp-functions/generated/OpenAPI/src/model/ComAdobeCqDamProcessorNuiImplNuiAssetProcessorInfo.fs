namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties

module ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo =

  //#region ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo

  [<CLIMutable>]
  type ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties;
  }

  //#endregion
