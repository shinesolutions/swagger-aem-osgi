namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties

module OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo =

  //#region OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo

  [<CLIMutable>]
  type OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
