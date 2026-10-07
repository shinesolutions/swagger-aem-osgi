namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties

module ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo =

  //#region ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties;
  }

  //#endregion
