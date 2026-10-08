namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties

module ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo =

  //#region ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties;
  }

  //#endregion
