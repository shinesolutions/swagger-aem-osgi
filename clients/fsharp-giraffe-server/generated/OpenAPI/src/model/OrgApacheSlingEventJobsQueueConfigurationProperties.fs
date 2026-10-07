namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyFloat
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEventJobsQueueConfigurationProperties =

  //#region OrgApacheSlingEventJobsQueueConfigurationProperties


  type orgApacheSlingEventJobsQueueConfigurationProperties = {
    QueueName : ConfigNodePropertyString;
    QueueTopics : ConfigNodePropertyArray;
    QueueType : ConfigNodePropertyDropDown;
    QueuePriority : ConfigNodePropertyDropDown;
    QueueRetries : ConfigNodePropertyInteger;
    QueueRetrydelay : ConfigNodePropertyInteger;
    QueueMaxparallel : ConfigNodePropertyFloat;
    QueueKeepJobs : ConfigNodePropertyBoolean;
    QueuePreferRunOnCreationInstance : ConfigNodePropertyBoolean;
    QueueThreadPoolSize : ConfigNodePropertyInteger;
    ServiceRanking : ConfigNodePropertyInteger;
  }
  //#endregion
