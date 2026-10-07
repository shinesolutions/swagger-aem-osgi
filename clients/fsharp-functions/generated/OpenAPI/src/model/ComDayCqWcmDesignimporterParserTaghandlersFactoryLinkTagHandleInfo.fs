namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties

module ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties;
  }

  //#endregion
