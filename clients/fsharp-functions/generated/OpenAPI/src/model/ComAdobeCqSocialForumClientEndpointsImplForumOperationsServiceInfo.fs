namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties

module ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo =

  //#region ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo

  [<CLIMutable>]
  type ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties;
  }

  //#endregion
