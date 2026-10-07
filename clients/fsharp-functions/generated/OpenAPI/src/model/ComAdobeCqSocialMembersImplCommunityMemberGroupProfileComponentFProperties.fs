namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties =

  //#region ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties

  [<CLIMutable>]
  type ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties = {
    [<JsonProperty(PropertyName = "everyoneLimit")>]
    EveryoneLimit : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "priority")>]
    Priority : ConfigNodePropertyInteger;
  }

  //#endregion
