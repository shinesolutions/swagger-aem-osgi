namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties =

  //#region ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties

  [<CLIMutable>]
  type ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties = {
    [<JsonProperty(PropertyName = "pipeline.type")>]
    PipelineType : ConfigNodePropertyString;
  }

  //#endregion
