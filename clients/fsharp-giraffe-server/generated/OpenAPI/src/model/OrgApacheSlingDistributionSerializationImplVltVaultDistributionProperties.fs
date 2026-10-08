namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties =

  //#region OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties


  type orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties = {
    Name : ConfigNodePropertyString;
    Type : ConfigNodePropertyDropDown;
    ImportMode : ConfigNodePropertyString;
    AclHandling : ConfigNodePropertyString;
    PackageRoots : ConfigNodePropertyString;
    PackageFilters : ConfigNodePropertyArray;
    PropertyFilters : ConfigNodePropertyArray;
    TempFsFolder : ConfigNodePropertyString;
    UseBinaryReferences : ConfigNodePropertyBoolean;
    AutoSaveThreshold : ConfigNodePropertyInteger;
    CleanupDelay : ConfigNodePropertyInteger;
    FileThreshold : ConfigNodePropertyInteger;
    MEGA_BYTES : ConfigNodePropertyDropDown;
    UseOffHeapMemory : ConfigNodePropertyBoolean;
    DigestAlgorithm : ConfigNodePropertyDropDown;
    MonitoringQueueSize : ConfigNodePropertyInteger;
    PathsMapping : ConfigNodePropertyArray;
    StrictImport : ConfigNodePropertyBoolean;
  }
  //#endregion
