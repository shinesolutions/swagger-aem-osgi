namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties =

  //#region ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties

  [<CLIMutable>]
  type ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties = {
    [<JsonProperty(PropertyName = "pipeline.type")>]
    PipelineType : ConfigNodePropertyString;
  }

  //#endregion
