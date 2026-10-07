namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties =

  //#region ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties

  [<CLIMutable>]
  type ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties = {
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludednodetypes")>]
    CqWcmMsmActionExcludednodetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludedparagraphitems")>]
    CqWcmMsmActionExcludedparagraphitems : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludedprops")>]
    CqWcmMsmActionExcludedprops : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate")>]
    CqWcmMsmImplActionsPagemovePropReferenceUpdate : ConfigNodePropertyBoolean;
  }

  //#endregion
