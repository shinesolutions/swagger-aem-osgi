namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties

module ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo =

  //#region ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo

  [<CLIMutable>]
  type ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties;
  }

  //#endregion
