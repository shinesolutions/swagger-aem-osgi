namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties =

  //#region ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties = {
    [<JsonProperty(PropertyName = "max.unread.notification.count")>]
    MaxUnreadNotificationCount : ConfigNodePropertyInteger;
  }

  //#endregion
