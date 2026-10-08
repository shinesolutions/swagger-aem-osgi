namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties

module ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo =

  //#region ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo

  [<CLIMutable>]
  type ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties;
  }

  //#endregion
