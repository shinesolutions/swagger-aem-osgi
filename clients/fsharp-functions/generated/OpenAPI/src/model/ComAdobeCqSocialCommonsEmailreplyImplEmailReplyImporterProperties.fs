namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown

module ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties =

  //#region ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties = {
    [<JsonProperty(PropertyName = "connectProtocol")>]
    ConnectProtocol : ConfigNodePropertyDropDown;
  }

  //#endregion
