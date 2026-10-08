namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties =

  //#region ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties

  [<CLIMutable>]
  type ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties = {
    [<JsonProperty(PropertyName = "notify.onupdate")>]
    NotifyOnupdate : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "notify.oncomplete")>]
    NotifyOncomplete : ConfigNodePropertyBoolean;
  }

  //#endregion
