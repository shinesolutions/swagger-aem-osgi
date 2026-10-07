namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties =

  //#region OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "type")>]
    Type : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "format.target")>]
    FormatTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "tempFsFolder")>]
    TempFsFolder : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "fileThreshold")>]
    FileThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "memoryUnit")>]
    MemoryUnit : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "useOffHeapMemory")>]
    UseOffHeapMemory : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "digestAlgorithm")>]
    DigestAlgorithm : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "monitoringQueueSize")>]
    MonitoringQueueSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cleanupDelay")>]
    CleanupDelay : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "package.filters")>]
    PackageFilters : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "property.filters")>]
    PropertyFilters : ConfigNodePropertyArray;
  }

  //#endregion
