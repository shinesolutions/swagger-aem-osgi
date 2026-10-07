namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWorkflowImplEmailEMailNotificationServiceProperties =

  //#region ComDayCqWorkflowImplEmailEMailNotificationServiceProperties

  [<CLIMutable>]
  type ComDayCqWorkflowImplEmailEMailNotificationServiceProperties = {
    [<JsonProperty(PropertyName = "from.address")>]
    FromAddress : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "host.prefix")>]
    HostPrefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "notify.onabort")>]
    NotifyOnabort : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "notify.oncomplete")>]
    NotifyOncomplete : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "notify.oncontainercomplete")>]
    NotifyOncontainercomplete : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "notify.useronly")>]
    NotifyUseronly : ConfigNodePropertyBoolean;
  }

  //#endregion
