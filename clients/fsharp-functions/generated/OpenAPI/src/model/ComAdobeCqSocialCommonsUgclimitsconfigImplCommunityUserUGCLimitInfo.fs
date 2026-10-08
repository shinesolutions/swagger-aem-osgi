namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties

module ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo =

  //#region ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties;
  }

  //#endregion
