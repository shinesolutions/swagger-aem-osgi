namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplDamEventPurgeServiceProperties =

  //#region ComDayCqDamCoreImplDamEventPurgeServiceProperties


  type comDayCqDamCoreImplDamEventPurgeServiceProperties = {
    SchedulerExpression : ConfigNodePropertyString;
    MaxSavedActivities : ConfigNodePropertyInteger;
    SaveInterval : ConfigNodePropertyInteger;
    EnableActivityPurge : ConfigNodePropertyBoolean;
    EventTypes : ConfigNodePropertyDropDown;
  }
  //#endregion
