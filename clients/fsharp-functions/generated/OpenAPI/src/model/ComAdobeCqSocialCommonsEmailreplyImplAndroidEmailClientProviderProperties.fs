namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties =

  //#region ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties = {
    [<JsonProperty(PropertyName = "priorityOrder")>]
    PriorityOrder : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "replyEmailPatterns")>]
    ReplyEmailPatterns : ConfigNodePropertyArray;
  }

  //#endregion
