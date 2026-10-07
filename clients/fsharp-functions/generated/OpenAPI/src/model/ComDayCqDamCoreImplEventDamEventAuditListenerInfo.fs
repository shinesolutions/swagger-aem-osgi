namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplEventDamEventAuditListenerProperties

module ComDayCqDamCoreImplEventDamEventAuditListenerInfo =

  //#region ComDayCqDamCoreImplEventDamEventAuditListenerInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplEventDamEventAuditListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplEventDamEventAuditListenerProperties;
  }

  //#endregion
