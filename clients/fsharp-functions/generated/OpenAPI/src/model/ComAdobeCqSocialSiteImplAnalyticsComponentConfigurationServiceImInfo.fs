namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties

module ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo =

  //#region ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo

  [<CLIMutable>]
  type ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties;
  }

  //#endregion
