namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmNotificationImplNotificationManagerImplProperties =

  //#region ComDayCqWcmNotificationImplNotificationManagerImplProperties

  [<CLIMutable>]
  type ComDayCqWcmNotificationImplNotificationManagerImplProperties = {
    [<JsonProperty(PropertyName = "event.topics")>]
    EventTopics : ConfigNodePropertyArray;
  }

  //#endregion
