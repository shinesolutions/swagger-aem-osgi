namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties =

  //#region ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties

  [<CLIMutable>]
  type ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties = {
    [<JsonProperty(PropertyName = "offloading.agentmanager.enabled")>]
    OffloadingAgentmanagerEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
