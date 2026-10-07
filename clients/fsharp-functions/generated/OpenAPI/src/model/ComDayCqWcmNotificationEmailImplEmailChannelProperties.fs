namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmNotificationEmailImplEmailChannelProperties =

  //#region ComDayCqWcmNotificationEmailImplEmailChannelProperties

  [<CLIMutable>]
  type ComDayCqWcmNotificationEmailImplEmailChannelProperties = {
    [<JsonProperty(PropertyName = "email.from")>]
    EmailFrom : ConfigNodePropertyString;
  }

  //#endregion
