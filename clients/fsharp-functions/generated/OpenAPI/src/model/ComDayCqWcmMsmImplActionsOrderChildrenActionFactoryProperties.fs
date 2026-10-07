namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties =

  //#region ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties

  [<CLIMutable>]
  type ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties = {
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludednodetypes")>]
    CqWcmMsmActionExcludednodetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludedparagraphitems")>]
    CqWcmMsmActionExcludedparagraphitems : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludedprops")>]
    CqWcmMsmActionExcludedprops : ConfigNodePropertyArray;
  }

  //#endregion
