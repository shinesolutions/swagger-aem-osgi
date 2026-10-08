namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties

module ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo =

  //#region ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo

  [<CLIMutable>]
  type ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties;
  }

  //#endregion
