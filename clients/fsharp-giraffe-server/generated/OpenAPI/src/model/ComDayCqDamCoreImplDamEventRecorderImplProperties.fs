namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplDamEventRecorderImplProperties =

  //#region ComDayCqDamCoreImplDamEventRecorderImplProperties


  type comDayCqDamCoreImplDamEventRecorderImplProperties = {
    EventFilter : ConfigNodePropertyString;
    EventQueueLength : ConfigNodePropertyInteger;
    EventrecorderEnabled : ConfigNodePropertyBoolean;
    EventrecorderBlacklist : ConfigNodePropertyArray;
    EventrecorderEventtypes : ConfigNodePropertyDropDown;
  }
  //#endregion
