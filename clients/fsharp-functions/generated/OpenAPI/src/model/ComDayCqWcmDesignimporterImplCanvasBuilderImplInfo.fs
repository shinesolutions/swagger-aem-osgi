namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties

module ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo =

  //#region ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties;
  }

  //#endregion
