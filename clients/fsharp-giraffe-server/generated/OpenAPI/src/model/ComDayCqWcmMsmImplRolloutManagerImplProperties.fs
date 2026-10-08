namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmMsmImplRolloutManagerImplProperties =

  //#region ComDayCqWcmMsmImplRolloutManagerImplProperties


  type comDayCqWcmMsmImplRolloutManagerImplProperties = {
    EventFilter : ConfigNodePropertyString;
    RolloutmgrExcludedpropsDefault : ConfigNodePropertyArray;
    RolloutmgrExcludedparagraphpropsDefault : ConfigNodePropertyArray;
    RolloutmgrExcludednodetypesDefault : ConfigNodePropertyArray;
    RolloutmgrThreadpoolMaxsize : ConfigNodePropertyInteger;
    RolloutmgrThreadpoolMaxshutdowntime : ConfigNodePropertyInteger;
    RolloutmgrThreadpoolPriority : ConfigNodePropertyDropDown;
    RolloutmgrCommitSize : ConfigNodePropertyInteger;
    RolloutmgrConflicthandlingEnabled : ConfigNodePropertyBoolean;
  }
  //#endregion
