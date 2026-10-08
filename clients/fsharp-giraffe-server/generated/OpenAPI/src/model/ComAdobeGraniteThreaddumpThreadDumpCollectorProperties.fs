namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteThreaddumpThreadDumpCollectorProperties =

  //#region ComAdobeGraniteThreaddumpThreadDumpCollectorProperties


  type comAdobeGraniteThreaddumpThreadDumpCollectorProperties = {
    SchedulerPeriod : ConfigNodePropertyInteger;
    SchedulerRunOn : ConfigNodePropertyDropDown;
    GraniteThreaddumpEnabled : ConfigNodePropertyBoolean;
    GraniteThreaddumpDumpsPerFile : ConfigNodePropertyInteger;
    GraniteThreaddumpEnableGzipCompression : ConfigNodePropertyBoolean;
    GraniteThreaddumpEnableDirectoriesCompression : ConfigNodePropertyBoolean;
    GraniteThreaddumpEnableJStack : ConfigNodePropertyBoolean;
    GraniteThreaddumpMaxBackupDays : ConfigNodePropertyInteger;
    GraniteThreaddumpBackupCleanTrigger : ConfigNodePropertyString;
  }
  //#endregion
