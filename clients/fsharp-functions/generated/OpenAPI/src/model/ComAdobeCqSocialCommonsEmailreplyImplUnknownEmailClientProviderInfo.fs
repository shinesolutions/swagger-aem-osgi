namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties

module ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo =

  //#region ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties;
  }

  //#endregion
