namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties

module ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties;
  }

  //#endregion
