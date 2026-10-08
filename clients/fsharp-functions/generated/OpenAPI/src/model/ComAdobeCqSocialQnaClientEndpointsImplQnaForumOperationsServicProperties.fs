namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties =

  //#region ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties

  [<CLIMutable>]
  type ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties = {
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "attachmentTypeBlacklist")>]
    AttachmentTypeBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
