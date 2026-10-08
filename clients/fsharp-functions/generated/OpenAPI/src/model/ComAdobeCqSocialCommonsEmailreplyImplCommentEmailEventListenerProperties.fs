namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties =

  //#region ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties = {
    [<JsonProperty(PropertyName = "event.topics")>]
    EventTopics : ConfigNodePropertyString;
  }

  //#endregion
