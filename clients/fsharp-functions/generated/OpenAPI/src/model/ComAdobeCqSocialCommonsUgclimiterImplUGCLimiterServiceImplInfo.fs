namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties

module ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo =

  //#region ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties;
  }

  //#endregion
