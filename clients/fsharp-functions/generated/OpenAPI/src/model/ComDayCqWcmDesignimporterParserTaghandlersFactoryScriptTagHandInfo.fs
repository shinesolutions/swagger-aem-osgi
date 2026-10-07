namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties

module ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties;
  }

  //#endregion
