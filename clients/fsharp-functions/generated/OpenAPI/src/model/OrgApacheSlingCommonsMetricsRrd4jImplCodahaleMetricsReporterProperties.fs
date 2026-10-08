namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties =

  //#region OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties

  [<CLIMutable>]
  type OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties = {
    [<JsonProperty(PropertyName = "datasources")>]
    Datasources : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "step")>]
    Step : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "archives")>]
    Archives : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
  }

  //#endregion
