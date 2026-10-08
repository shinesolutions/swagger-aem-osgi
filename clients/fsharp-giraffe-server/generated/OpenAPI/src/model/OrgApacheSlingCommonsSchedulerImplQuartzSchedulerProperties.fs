namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties =

  //#region OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties


  type orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties = {
    PoolName : ConfigNodePropertyString;
    AllowedPoolNames : ConfigNodePropertyArray;
    SchedulerUseleaderforsingle : ConfigNodePropertyBoolean;
    MetricsFilters : ConfigNodePropertyArray;
    SlowThresholdMillis : ConfigNodePropertyInteger;
  }
  //#endregion
