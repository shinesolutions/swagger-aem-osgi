namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties

module ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo =

  //#region ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties;
  }

  //#endregion
