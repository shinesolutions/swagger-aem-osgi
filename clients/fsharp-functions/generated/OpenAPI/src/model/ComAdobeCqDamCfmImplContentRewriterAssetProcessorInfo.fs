namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties

module ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo =

  //#region ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo

  [<CLIMutable>]
  type ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties;
  }

  //#endregion
