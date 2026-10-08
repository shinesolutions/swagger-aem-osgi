namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties =

  //#region OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties


  type orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties = {
    HcName : ConfigNodePropertyString;
    HcTags : ConfigNodePropertyArray;
    HcMbeanName : ConfigNodePropertyString;
    NumberOfRetriesAllowed : ConfigNodePropertyInteger;
  }
  //#endregion
