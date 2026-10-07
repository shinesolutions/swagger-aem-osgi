namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingEventImplJobsJobConsumerManagerProperties =

  //#region OrgApacheSlingEventImplJobsJobConsumerManagerProperties


  type orgApacheSlingEventImplJobsJobConsumerManagerProperties = {
    OrgApacheSlingInstallerConfigurationPersist : ConfigNodePropertyBoolean;
    JobConsumermanagerWhitelist : ConfigNodePropertyArray;
    JobConsumermanagerBlacklist : ConfigNodePropertyArray;
  }
  //#endregion
