namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqReportingImplRLogAnalyzerProperties

module ComDayCqReportingImplRLogAnalyzerInfo =

  //#region ComDayCqReportingImplRLogAnalyzerInfo

  [<CLIMutable>]
  type ComDayCqReportingImplRLogAnalyzerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqReportingImplRLogAnalyzerProperties;
  }

  //#endregion
