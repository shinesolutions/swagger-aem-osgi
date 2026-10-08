namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties =

  //#region ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties = {
    [<JsonProperty(PropertyName = "default.attachment.type.blacklist")>]
    DefaultAttachmentTypeBlacklist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "baseline.attachment.type.blacklist")>]
    BaselineAttachmentTypeBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
