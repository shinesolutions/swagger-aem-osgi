namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties =

  //#region OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties

  [<CLIMutable>]
  type OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties = {
    [<JsonProperty(PropertyName = "poolName")>]
    PoolName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "allowedPoolNames")>]
    AllowedPoolNames : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "scheduler.useleaderforsingle")>]
    SchedulerUseleaderforsingle : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "metrics.filters")>]
    MetricsFilters : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "slowThresholdMillis")>]
    SlowThresholdMillis : ConfigNodePropertyInteger;
  }

  //#endregion
