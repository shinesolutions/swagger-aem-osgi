namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties =

  //#region ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties

  [<CLIMutable>]
  type ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties = {
    [<JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.mapping.links")>]
    CqContentsyncPathrewritertransformerMappingLinks : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.mapping.clientlibs")>]
    CqContentsyncPathrewritertransformerMappingClientlibs : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.mapping.images")>]
    CqContentsyncPathrewritertransformerMappingImages : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.attribute.pattern")>]
    CqContentsyncPathrewritertransformerAttributePattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.clientlibrary.pattern")>]
    CqContentsyncPathrewritertransformerClientlibraryPattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.clientlibrary.replace")>]
    CqContentsyncPathrewritertransformerClientlibraryReplace : ConfigNodePropertyString;
  }

  //#endregion
