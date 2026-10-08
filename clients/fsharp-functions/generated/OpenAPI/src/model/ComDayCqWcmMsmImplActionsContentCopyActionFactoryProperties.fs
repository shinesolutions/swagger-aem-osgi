namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown

module ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties =

  //#region ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties

  [<CLIMutable>]
  type ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties = {
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludednodetypes")>]
    CqWcmMsmActionExcludednodetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludedparagraphitems")>]
    CqWcmMsmActionExcludedparagraphitems : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludedprops")>]
    CqWcmMsmActionExcludedprops : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "contentcopyaction.order.style")>]
    ContentcopyactionOrderStyle : ConfigNodePropertyDropDown;
  }

  //#endregion
