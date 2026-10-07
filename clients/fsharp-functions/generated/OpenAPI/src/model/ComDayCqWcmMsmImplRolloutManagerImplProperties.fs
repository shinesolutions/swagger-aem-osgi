namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmMsmImplRolloutManagerImplProperties =

  //#region ComDayCqWcmMsmImplRolloutManagerImplProperties

  [<CLIMutable>]
  type ComDayCqWcmMsmImplRolloutManagerImplProperties = {
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "rolloutmgr.excludedprops.default")>]
    RolloutmgrExcludedpropsDefault : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "rolloutmgr.excludedparagraphprops.default")>]
    RolloutmgrExcludedparagraphpropsDefault : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "rolloutmgr.excludednodetypes.default")>]
    RolloutmgrExcludednodetypesDefault : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "rolloutmgr.threadpool.maxsize")>]
    RolloutmgrThreadpoolMaxsize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "rolloutmgr.threadpool.maxshutdowntime")>]
    RolloutmgrThreadpoolMaxshutdowntime : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "rolloutmgr.threadpool.priority")>]
    RolloutmgrThreadpoolPriority : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "rolloutmgr.commit.size")>]
    RolloutmgrCommitSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "rolloutmgr.conflicthandling.enabled")>]
    RolloutmgrConflicthandlingEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
