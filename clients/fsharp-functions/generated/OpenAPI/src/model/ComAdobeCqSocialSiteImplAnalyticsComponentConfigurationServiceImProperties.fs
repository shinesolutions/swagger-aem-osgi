namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties =

  //#region ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties

  [<CLIMutable>]
  type ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties = {
    [<JsonProperty(PropertyName = "cq.social.console.analytics.components")>]
    CqSocialConsoleAnalyticsComponents : ConfigNodePropertyArray;
  }

  //#endregion
