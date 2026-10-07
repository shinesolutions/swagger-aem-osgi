namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties

module ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo =

  //#region ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo

  [<CLIMutable>]
  type ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties;
  }

  //#endregion
