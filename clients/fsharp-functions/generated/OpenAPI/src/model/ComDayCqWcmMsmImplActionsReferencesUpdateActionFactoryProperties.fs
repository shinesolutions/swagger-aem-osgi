namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties =

  //#region ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties

  [<CLIMutable>]
  type ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties = {
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludednodetypes")>]
    CqWcmMsmActionExcludednodetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludedparagraphitems")>]
    CqWcmMsmActionExcludedparagraphitems : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.msm.action.excludedprops")>]
    CqWcmMsmActionExcludedprops : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.msm.impl.action.referencesupdate.prop_updateNested")>]
    CqWcmMsmImplActionReferencesupdatePropUpdateNested : ConfigNodePropertyBoolean;
  }

  //#endregion
