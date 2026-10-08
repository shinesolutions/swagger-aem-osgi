namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties =

  //#region ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties

  [<CLIMutable>]
  type ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "job.purge.threshold")>]
    JobPurgeThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "job.purge.max.jobs")>]
    JobPurgeMaxJobs : ConfigNodePropertyInteger;
  }

  //#endregion
