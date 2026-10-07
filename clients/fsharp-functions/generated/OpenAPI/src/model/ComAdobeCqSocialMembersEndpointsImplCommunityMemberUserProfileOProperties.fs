namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties =

  //#region ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties

  [<CLIMutable>]
  type ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties = {
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
  }

  //#endregion
