namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteThreaddumpThreadDumpCollectorProperties =

  //#region ComAdobeGraniteThreaddumpThreadDumpCollectorProperties

  [<CLIMutable>]
  type ComAdobeGraniteThreaddumpThreadDumpCollectorProperties = {
    [<JsonProperty(PropertyName = "scheduler.period")>]
    SchedulerPeriod : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "scheduler.runOn")>]
    SchedulerRunOn : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "granite.threaddump.enabled")>]
    GraniteThreaddumpEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "granite.threaddump.dumpsPerFile")>]
    GraniteThreaddumpDumpsPerFile : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "granite.threaddump.enableGzipCompression")>]
    GraniteThreaddumpEnableGzipCompression : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "granite.threaddump.enableDirectoriesCompression")>]
    GraniteThreaddumpEnableDirectoriesCompression : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "granite.threaddump.enableJStack")>]
    GraniteThreaddumpEnableJStack : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "granite.threaddump.maxBackupDays")>]
    GraniteThreaddumpMaxBackupDays : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "granite.threaddump.backupCleanTrigger")>]
    GraniteThreaddumpBackupCleanTrigger : ConfigNodePropertyString;
  }

  //#endregion
