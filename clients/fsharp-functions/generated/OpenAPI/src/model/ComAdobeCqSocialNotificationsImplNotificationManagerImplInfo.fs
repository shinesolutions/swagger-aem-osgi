namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties

module ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo =

  //#region ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo

  [<CLIMutable>]
  type ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties;
  }

  //#endregion
