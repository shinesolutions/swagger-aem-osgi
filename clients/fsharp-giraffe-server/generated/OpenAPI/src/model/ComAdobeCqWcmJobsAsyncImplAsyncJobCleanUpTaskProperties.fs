namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties =

  //#region ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties


  type comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties = {
    SchedulerExpression : ConfigNodePropertyString;
    JobPurgeThreshold : ConfigNodePropertyInteger;
    JobPurgeMaxJobs : ConfigNodePropertyInteger;
  }
  //#endregion
