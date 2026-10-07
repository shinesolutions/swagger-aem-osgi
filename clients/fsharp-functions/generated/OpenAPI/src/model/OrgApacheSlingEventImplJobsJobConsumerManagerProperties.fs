namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingEventImplJobsJobConsumerManagerProperties =

  //#region OrgApacheSlingEventImplJobsJobConsumerManagerProperties

  [<CLIMutable>]
  type OrgApacheSlingEventImplJobsJobConsumerManagerProperties = {
    [<JsonProperty(PropertyName = "org.apache.sling.installer.configuration.persist")>]
    OrgApacheSlingInstallerConfigurationPersist : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "job.consumermanager.whitelist")>]
    JobConsumermanagerWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "job.consumermanager.blacklist")>]
    JobConsumermanagerBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
