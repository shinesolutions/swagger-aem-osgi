namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties

module ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo =

  //#region ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties;
  }

  //#endregion
