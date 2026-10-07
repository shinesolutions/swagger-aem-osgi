namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties =

  //#region ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties

  [<CLIMutable>]
  type ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties = {
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "attachmentTypeBlacklist")>]
    AttachmentTypeBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
