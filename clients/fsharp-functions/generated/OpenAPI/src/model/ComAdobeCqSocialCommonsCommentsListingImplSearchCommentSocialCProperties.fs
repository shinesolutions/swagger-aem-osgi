namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties =

  //#region ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties = {
    [<JsonProperty(PropertyName = "numUserLimit")>]
    NumUserLimit : ConfigNodePropertyInteger;
  }

  //#endregion
