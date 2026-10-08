namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqRewriterProcessorImplHtmlParserFactoryProperties =

  //#region ComDayCqRewriterProcessorImplHtmlParserFactoryProperties

  [<CLIMutable>]
  type ComDayCqRewriterProcessorImplHtmlParserFactoryProperties = {
    [<JsonProperty(PropertyName = "htmlparser.processTags")>]
    HtmlparserProcessTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "htmlparser.preserveCamelCase")>]
    HtmlparserPreserveCamelCase : ConfigNodePropertyBoolean;
  }

  //#endregion
