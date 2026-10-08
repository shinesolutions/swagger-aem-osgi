namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties

module ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties;
  }

  //#endregion
