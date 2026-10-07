namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqNotificationImplNotificationServiceImplProperties =

  //#region ComDayCqNotificationImplNotificationServiceImplProperties

  [<CLIMutable>]
  type ComDayCqNotificationImplNotificationServiceImplProperties = {
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
  }

  //#endregion
