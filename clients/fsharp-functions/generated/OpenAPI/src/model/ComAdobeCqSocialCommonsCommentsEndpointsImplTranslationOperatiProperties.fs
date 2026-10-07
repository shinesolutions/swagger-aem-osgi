namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties =

  //#region ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties = {
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "attachmentTypeBlacklist")>]
    AttachmentTypeBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
