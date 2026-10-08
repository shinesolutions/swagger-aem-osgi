namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties =

  //#region ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties = {
    [<JsonProperty(PropertyName = "enable")>]
    Enable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "UGCLimit")>]
    UGCLimit : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "ugcLimitDuration")>]
    UgcLimitDuration : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "domains")>]
    Domains : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "toList")>]
    ToList : ConfigNodePropertyArray;
  }

  //#endregion
