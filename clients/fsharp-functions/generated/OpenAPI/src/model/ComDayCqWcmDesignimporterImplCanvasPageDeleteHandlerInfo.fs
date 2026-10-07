namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties

module ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo =

  //#region ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties;
  }

  //#endregion
