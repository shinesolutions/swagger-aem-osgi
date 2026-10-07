namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties =

  //#region OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties


  type orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties = {
    Name : ConfigNodePropertyString;
    Type : ConfigNodePropertyDropDown;
    FormatTarget : ConfigNodePropertyString;
    TempFsFolder : ConfigNodePropertyString;
    FileThreshold : ConfigNodePropertyInteger;
    MemoryUnit : ConfigNodePropertyDropDown;
    UseOffHeapMemory : ConfigNodePropertyBoolean;
    DigestAlgorithm : ConfigNodePropertyDropDown;
    MonitoringQueueSize : ConfigNodePropertyInteger;
    CleanupDelay : ConfigNodePropertyInteger;
    PackageFilters : ConfigNodePropertyArray;
    PropertyFilters : ConfigNodePropertyArray;
  }
  //#endregion
