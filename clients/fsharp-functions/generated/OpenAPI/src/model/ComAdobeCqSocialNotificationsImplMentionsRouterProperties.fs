namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialNotificationsImplMentionsRouterProperties =

  //#region ComAdobeCqSocialNotificationsImplMentionsRouterProperties

  [<CLIMutable>]
  type ComAdobeCqSocialNotificationsImplMentionsRouterProperties = {
    [<JsonProperty(PropertyName = "event.topics")>]
    EventTopics : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
  }

  //#endregion
