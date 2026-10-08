namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties =

  //#region ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties

  [<CLIMutable>]
  type ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties = {
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
  }

  //#endregion
