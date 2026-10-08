namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties

module ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo =

  //#region ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo

  [<CLIMutable>]
  type ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties;
  }

  //#endregion
