namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyFloat
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEventJobsQueueConfigurationProperties =

  //#region OrgApacheSlingEventJobsQueueConfigurationProperties

  [<CLIMutable>]
  type OrgApacheSlingEventJobsQueueConfigurationProperties = {
    [<JsonProperty(PropertyName = "queue.name")>]
    QueueName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "queue.topics")>]
    QueueTopics : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "queue.type")>]
    QueueType : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "queue.priority")>]
    QueuePriority : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "queue.retries")>]
    QueueRetries : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "queue.retrydelay")>]
    QueueRetrydelay : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "queue.maxparallel")>]
    QueueMaxparallel : ConfigNodePropertyFloat;
    [<JsonProperty(PropertyName = "queue.keepJobs")>]
    QueueKeepJobs : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "queue.preferRunOnCreationInstance")>]
    QueuePreferRunOnCreationInstance : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "queue.threadPoolSize")>]
    QueueThreadPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
  }

  //#endregion
