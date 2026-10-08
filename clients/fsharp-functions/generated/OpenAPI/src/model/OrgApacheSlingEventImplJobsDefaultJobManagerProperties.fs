namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingEventImplJobsDefaultJobManagerProperties =

  //#region OrgApacheSlingEventImplJobsDefaultJobManagerProperties

  [<CLIMutable>]
  type OrgApacheSlingEventImplJobsDefaultJobManagerProperties = {
    [<JsonProperty(PropertyName = "queue.priority")>]
    QueuePriority : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "queue.retries")>]
    QueueRetries : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "queue.retrydelay")>]
    QueueRetrydelay : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "queue.maxparallel")>]
    QueueMaxparallel : ConfigNodePropertyInteger;
  }

  //#endregion
