namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties =

  //#region ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties

  [<CLIMutable>]
  type ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties = {
    [<JsonProperty(PropertyName = "cq.social.reporting.analytics.polling.importer.interval")>]
    CqSocialReportingAnalyticsPollingImporterInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.social.reporting.analytics.polling.importer.pageSize")>]
    CqSocialReportingAnalyticsPollingImporterPageSize : ConfigNodePropertyInteger;
  }

  //#endregion
