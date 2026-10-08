namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsMetricsInternalLogReporterProperties =

  //#region OrgApacheSlingCommonsMetricsInternalLogReporterProperties

  [<CLIMutable>]
  type OrgApacheSlingCommonsMetricsInternalLogReporterProperties = {
    [<JsonProperty(PropertyName = "period")>]
    Period : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "timeUnit")>]
    TimeUnit : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "level")>]
    Level : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "loggerName")>]
    LoggerName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "prefix")>]
    Prefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pattern")>]
    Pattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "registryName")>]
    RegistryName : ConfigNodePropertyString;
  }

  //#endregion
