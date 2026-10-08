namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties

module ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo =

  //#region ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo

  [<CLIMutable>]
  type ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties;
  }

  //#endregion
