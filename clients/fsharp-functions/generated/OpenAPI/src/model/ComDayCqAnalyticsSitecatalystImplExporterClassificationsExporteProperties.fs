namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties =

  //#region ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties

  [<CLIMutable>]
  type ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties = {
    [<JsonProperty(PropertyName = "allowed.paths")>]
    AllowedPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.analytics.saint.exporter.pagesize")>]
    CqAnalyticsSaintExporterPagesize : ConfigNodePropertyInteger;
  }

  //#endregion
