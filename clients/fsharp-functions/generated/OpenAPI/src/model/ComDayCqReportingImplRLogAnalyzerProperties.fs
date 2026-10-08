namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqReportingImplRLogAnalyzerProperties =

  //#region ComDayCqReportingImplRLogAnalyzerProperties

  [<CLIMutable>]
  type ComDayCqReportingImplRLogAnalyzerProperties = {
    [<JsonProperty(PropertyName = "request.log.output")>]
    RequestLogOutput : ConfigNodePropertyString;
  }

  //#endregion
