namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties =

  //#region ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties

  [<CLIMutable>]
  type ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties = {
    [<JsonProperty(PropertyName = "pipeline.type")>]
    PipelineType : ConfigNodePropertyString;
  }

  //#endregion
