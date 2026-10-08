namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqNotificationImplNotificationServiceImplProperties

module ComDayCqNotificationImplNotificationServiceImplInfo =

  //#region ComDayCqNotificationImplNotificationServiceImplInfo

  [<CLIMutable>]
  type ComDayCqNotificationImplNotificationServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqNotificationImplNotificationServiceImplProperties;
  }

  //#endregion
