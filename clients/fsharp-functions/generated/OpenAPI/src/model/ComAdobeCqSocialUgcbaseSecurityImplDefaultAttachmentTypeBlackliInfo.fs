namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties

module ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo =

  //#region ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties;
  }

  //#endregion
