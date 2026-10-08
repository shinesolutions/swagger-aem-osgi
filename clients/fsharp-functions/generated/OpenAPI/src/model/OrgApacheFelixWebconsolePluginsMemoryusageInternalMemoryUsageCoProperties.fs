namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties =

  //#region OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties

  [<CLIMutable>]
  type OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties = {
    [<JsonProperty(PropertyName = "felix.memoryusage.dump.threshold")>]
    FelixMemoryusageDumpThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "felix.memoryusage.dump.interval")>]
    FelixMemoryusageDumpInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "felix.memoryusage.dump.location")>]
    FelixMemoryusageDumpLocation : ConfigNodePropertyString;
  }

  //#endregion
