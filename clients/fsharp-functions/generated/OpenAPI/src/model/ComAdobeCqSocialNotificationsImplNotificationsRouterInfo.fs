namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialNotificationsImplNotificationsRouterProperties

module ComAdobeCqSocialNotificationsImplNotificationsRouterInfo =

  //#region ComAdobeCqSocialNotificationsImplNotificationsRouterInfo

  [<CLIMutable>]
  type ComAdobeCqSocialNotificationsImplNotificationsRouterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialNotificationsImplNotificationsRouterProperties;
  }

  //#endregion
