namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties =

  //#region OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties

  [<CLIMutable>]
  type OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties = {
    [<JsonProperty(PropertyName = "max.quartzJob.duration.acceptable")>]
    MaxQuartzJobDurationAcceptable : ConfigNodePropertyInteger;
  }

  //#endregion
