namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties

module ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo =

  //#region ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo

  [<CLIMutable>]
  type ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties;
  }

  //#endregion
