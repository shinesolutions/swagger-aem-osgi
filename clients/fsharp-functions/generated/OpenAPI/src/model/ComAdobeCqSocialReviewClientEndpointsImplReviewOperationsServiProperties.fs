namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties =

  //#region ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties

  [<CLIMutable>]
  type ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties = {
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "attachmentTypeBlacklist")>]
    AttachmentTypeBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
