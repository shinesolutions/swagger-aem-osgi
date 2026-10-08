namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCoreImplReportsReportExportServiceProperties =

  //#region ComDayCqDamCoreImplReportsReportExportServiceProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplReportsReportExportServiceProperties = {
    [<JsonProperty(PropertyName = "queryBatchSize")>]
    QueryBatchSize : ConfigNodePropertyInteger;
  }

  //#endregion
