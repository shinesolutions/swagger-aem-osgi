namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties

module ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo =

  //#region ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties;
  }

  //#endregion
