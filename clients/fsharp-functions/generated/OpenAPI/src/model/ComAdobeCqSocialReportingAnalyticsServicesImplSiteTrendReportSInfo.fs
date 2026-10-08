namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties

module ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo =

  //#region ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo

  [<CLIMutable>]
  type ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties;
  }

  //#endregion
