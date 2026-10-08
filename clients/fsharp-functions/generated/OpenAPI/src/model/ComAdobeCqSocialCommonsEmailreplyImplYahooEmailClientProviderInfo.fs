namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties

module ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo =

  //#region ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties;
  }

  //#endregion
