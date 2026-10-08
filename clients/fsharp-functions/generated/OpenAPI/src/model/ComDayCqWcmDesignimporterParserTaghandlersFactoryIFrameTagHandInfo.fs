namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties

module ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties;
  }

  //#endregion
