namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties =

  //#region ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties

  [<CLIMutable>]
  type ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties = {
    [<JsonProperty(PropertyName = "report.fetch.attempts")>]
    ReportFetchAttempts : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "report.fetch.delay")>]
    ReportFetchDelay : ConfigNodePropertyInteger;
  }

  //#endregion
