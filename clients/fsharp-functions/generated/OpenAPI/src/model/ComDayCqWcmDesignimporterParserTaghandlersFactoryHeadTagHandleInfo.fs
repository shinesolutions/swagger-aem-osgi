namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties

module ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties;
  }

  //#endregion
