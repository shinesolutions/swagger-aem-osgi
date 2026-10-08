namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties =

  //#region ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties

  [<CLIMutable>]
  type ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties = {
    [<JsonProperty(PropertyName = "reportingservices.url")>]
    ReportingservicesUrl : ConfigNodePropertyString;
  }

  //#endregion
