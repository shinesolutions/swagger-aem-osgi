namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties =

  //#region ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties

  [<CLIMutable>]
  type ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties = {
    [<JsonProperty(PropertyName = "cq.social.console.analytics.sites.mapping")>]
    CqSocialConsoleAnalyticsSitesMapping : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "priority")>]
    Priority : ConfigNodePropertyInteger;
  }

  //#endregion
