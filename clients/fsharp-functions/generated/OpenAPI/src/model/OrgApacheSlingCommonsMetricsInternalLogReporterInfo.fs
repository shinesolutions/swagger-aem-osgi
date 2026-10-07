namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCommonsMetricsInternalLogReporterProperties

module OrgApacheSlingCommonsMetricsInternalLogReporterInfo =

  //#region OrgApacheSlingCommonsMetricsInternalLogReporterInfo

  [<CLIMutable>]
  type OrgApacheSlingCommonsMetricsInternalLogReporterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCommonsMetricsInternalLogReporterProperties;
  }

  //#endregion
