namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties

module ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo =

  //#region ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties;
  }

  //#endregion
