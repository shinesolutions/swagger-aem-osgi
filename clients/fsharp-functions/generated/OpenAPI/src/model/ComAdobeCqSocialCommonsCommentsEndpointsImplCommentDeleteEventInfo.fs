namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties

module ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo =

  //#region ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties;
  }

  //#endregion
