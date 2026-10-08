namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties =

  //#region ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties

  [<CLIMutable>]
  type ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties = {
    [<JsonProperty(PropertyName = "reportingservices.proxy.whitelist")>]
    ReportingservicesProxyWhitelist : ConfigNodePropertyArray;
  }

  //#endregion
