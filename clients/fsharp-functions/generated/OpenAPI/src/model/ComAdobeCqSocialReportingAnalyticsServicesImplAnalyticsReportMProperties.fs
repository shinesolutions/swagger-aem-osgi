namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties =

  //#region ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties

  [<CLIMutable>]
  type ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties = {
    [<JsonProperty(PropertyName = "report.fetch.delay")>]
    ReportFetchDelay : ConfigNodePropertyInteger;
  }

  //#endregion
