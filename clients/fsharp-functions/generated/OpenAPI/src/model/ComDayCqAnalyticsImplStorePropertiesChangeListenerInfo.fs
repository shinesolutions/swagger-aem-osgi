namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties

module ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo =

  //#region ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo

  [<CLIMutable>]
  type ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties;
  }

  //#endregion
