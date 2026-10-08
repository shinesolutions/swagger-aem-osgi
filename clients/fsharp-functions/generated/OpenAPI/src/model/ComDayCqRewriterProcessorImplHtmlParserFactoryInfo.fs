namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqRewriterProcessorImplHtmlParserFactoryProperties

module ComDayCqRewriterProcessorImplHtmlParserFactoryInfo =

  //#region ComDayCqRewriterProcessorImplHtmlParserFactoryInfo

  [<CLIMutable>]
  type ComDayCqRewriterProcessorImplHtmlParserFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqRewriterProcessorImplHtmlParserFactoryProperties;
  }

  //#endregion
