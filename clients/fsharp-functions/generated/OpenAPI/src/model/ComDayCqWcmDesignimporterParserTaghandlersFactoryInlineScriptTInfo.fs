namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties

module ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties;
  }

  //#endregion
