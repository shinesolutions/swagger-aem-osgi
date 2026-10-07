namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties =

  //#region ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties = {
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "attachmentTypeBlacklist")>]
    AttachmentTypeBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
