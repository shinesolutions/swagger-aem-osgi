namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties

module ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo =

  //#region ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo

  [<CLIMutable>]
  type ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties;
  }

  //#endregion
