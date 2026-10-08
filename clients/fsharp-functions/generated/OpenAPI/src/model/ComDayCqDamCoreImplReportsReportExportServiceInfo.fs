namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplReportsReportExportServiceProperties

module ComDayCqDamCoreImplReportsReportExportServiceInfo =

  //#region ComDayCqDamCoreImplReportsReportExportServiceInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplReportsReportExportServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplReportsReportExportServiceProperties;
  }

  //#endregion
