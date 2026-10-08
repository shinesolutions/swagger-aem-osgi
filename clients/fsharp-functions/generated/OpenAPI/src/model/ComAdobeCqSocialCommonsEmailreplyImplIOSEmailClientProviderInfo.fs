namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties

module ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo =

  //#region ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties;
  }

  //#endregion
