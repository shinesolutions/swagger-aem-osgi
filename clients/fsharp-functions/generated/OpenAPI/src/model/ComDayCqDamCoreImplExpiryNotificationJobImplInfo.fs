namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplExpiryNotificationJobImplProperties

module ComDayCqDamCoreImplExpiryNotificationJobImplInfo =

  //#region ComDayCqDamCoreImplExpiryNotificationJobImplInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplExpiryNotificationJobImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplExpiryNotificationJobImplProperties;
  }

  //#endregion
