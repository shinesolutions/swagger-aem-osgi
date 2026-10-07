namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties =

  //#region ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties

  [<CLIMutable>]
  type ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties = {
    [<JsonProperty(PropertyName = "default.attachment.type.blacklist")>]
    DefaultAttachmentTypeBlacklist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "baseline.attachment.type.blacklist")>]
    BaselineAttachmentTypeBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
