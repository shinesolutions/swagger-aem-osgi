namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmNotificationImplNotificationManagerImplProperties

module ComDayCqWcmNotificationImplNotificationManagerImplInfo =

  //#region ComDayCqWcmNotificationImplNotificationManagerImplInfo

  [<CLIMutable>]
  type ComDayCqWcmNotificationImplNotificationManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmNotificationImplNotificationManagerImplProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
