namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties =

  //#region ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties = {
    [<JsonProperty(PropertyName = "payload.move.white.list")>]
    PayloadMoveWhiteList : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "payload.move.handle.from.workflow.process")>]
    PayloadMoveHandleFromWorkflowProcess : ConfigNodePropertyBoolean;
  }

  //#endregion
