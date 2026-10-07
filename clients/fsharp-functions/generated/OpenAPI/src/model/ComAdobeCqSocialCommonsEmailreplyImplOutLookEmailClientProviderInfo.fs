namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties

module ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo =

  //#region ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties;
  }

  //#endregion
