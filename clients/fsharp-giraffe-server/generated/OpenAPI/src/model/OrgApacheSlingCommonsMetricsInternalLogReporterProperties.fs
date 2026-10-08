namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsMetricsInternalLogReporterProperties =

  //#region OrgApacheSlingCommonsMetricsInternalLogReporterProperties


  type orgApacheSlingCommonsMetricsInternalLogReporterProperties = {
    Period : ConfigNodePropertyInteger;
    TimeUnit : ConfigNodePropertyDropDown;
    Level : ConfigNodePropertyDropDown;
    LoggerName : ConfigNodePropertyString;
    Prefix : ConfigNodePropertyString;
    Pattern : ConfigNodePropertyString;
    RegistryName : ConfigNodePropertyString;
  }
  //#endregion
