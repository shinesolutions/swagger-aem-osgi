namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplEventPageEventAuditListenerProperties =

  //#region ComDayCqWcmCoreImplEventPageEventAuditListenerProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplEventPageEventAuditListenerProperties = {
    [<JsonProperty(PropertyName = "configured")>]
    Configured : ConfigNodePropertyString;
  }

  //#endregion
