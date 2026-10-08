namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties =

  //#region OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "type")>]
    Type : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "importMode")>]
    ImportMode : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "aclHandling")>]
    AclHandling : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "package.roots")>]
    PackageRoots : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "package.filters")>]
    PackageFilters : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "property.filters")>]
    PropertyFilters : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "tempFsFolder")>]
    TempFsFolder : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "useBinaryReferences")>]
    UseBinaryReferences : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "autoSaveThreshold")>]
    AutoSaveThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cleanupDelay")>]
    CleanupDelay : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "fileThreshold")>]
    FileThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "MEGA_BYTES")>]
    MEGA_BYTES : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "useOffHeapMemory")>]
    UseOffHeapMemory : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "digestAlgorithm")>]
    DigestAlgorithm : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "monitoringQueueSize")>]
    MonitoringQueueSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "pathsMapping")>]
    PathsMapping : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "strictImport")>]
    StrictImport : ConfigNodePropertyBoolean;
  }

  //#endregion
