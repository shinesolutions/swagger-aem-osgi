namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplEventDamEventAuditListenerProperties =

  //#region ComDayCqDamCoreImplEventDamEventAuditListenerProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplEventDamEventAuditListenerProperties = {
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
  }

  //#endregion
