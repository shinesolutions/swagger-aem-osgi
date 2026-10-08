namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties

module ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties;
  }

  //#endregion
