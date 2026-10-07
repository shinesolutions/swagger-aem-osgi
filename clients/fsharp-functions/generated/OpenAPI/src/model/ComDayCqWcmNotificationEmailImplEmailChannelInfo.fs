namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmNotificationEmailImplEmailChannelProperties

module ComDayCqWcmNotificationEmailImplEmailChannelInfo =

  //#region ComDayCqWcmNotificationEmailImplEmailChannelInfo

  [<CLIMutable>]
  type ComDayCqWcmNotificationEmailImplEmailChannelInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmNotificationEmailImplEmailChannelProperties;
  }

  //#endregion
