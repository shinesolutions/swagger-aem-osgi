namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties =

  //#region ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties = {
    [<JsonProperty(PropertyName = "attachmentTypeBlacklist")>]
    AttachmentTypeBlacklist : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "extension.order")>]
    ExtensionOrder : ConfigNodePropertyInteger;
  }

  //#endregion
