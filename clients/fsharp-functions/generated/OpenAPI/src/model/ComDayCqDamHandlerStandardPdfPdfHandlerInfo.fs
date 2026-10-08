namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamHandlerStandardPdfPdfHandlerProperties

module ComDayCqDamHandlerStandardPdfPdfHandlerInfo =

  //#region ComDayCqDamHandlerStandardPdfPdfHandlerInfo

  [<CLIMutable>]
  type ComDayCqDamHandlerStandardPdfPdfHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamHandlerStandardPdfPdfHandlerProperties;
  }

  //#endregion
