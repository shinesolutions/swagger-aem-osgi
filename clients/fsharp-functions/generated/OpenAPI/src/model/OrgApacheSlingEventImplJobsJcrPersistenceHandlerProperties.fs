namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties =

  //#region OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties

  [<CLIMutable>]
  type OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties = {
    [<JsonProperty(PropertyName = "job.consumermanager.disableDistribution")>]
    JobConsumermanagerDisableDistribution : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "startup.delay")>]
    StartupDelay : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cleanup.period")>]
    CleanupPeriod : ConfigNodePropertyInteger;
  }

  //#endregion
