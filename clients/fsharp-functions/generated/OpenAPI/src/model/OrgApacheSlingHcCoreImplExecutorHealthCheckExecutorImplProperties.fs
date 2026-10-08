namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties =

  //#region OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties = {
    [<JsonProperty(PropertyName = "timeoutInMs")>]
    TimeoutInMs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "longRunningFutureThresholdForCriticalMs")>]
    LongRunningFutureThresholdForCriticalMs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "resultCacheTtlInMs")>]
    ResultCacheTtlInMs : ConfigNodePropertyInteger;
  }

  //#endregion
