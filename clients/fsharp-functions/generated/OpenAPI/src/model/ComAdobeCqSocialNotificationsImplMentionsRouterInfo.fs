namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialNotificationsImplMentionsRouterProperties

module ComAdobeCqSocialNotificationsImplMentionsRouterInfo =

  //#region ComAdobeCqSocialNotificationsImplMentionsRouterInfo

  [<CLIMutable>]
  type ComAdobeCqSocialNotificationsImplMentionsRouterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialNotificationsImplMentionsRouterProperties;
  }

  //#endregion
