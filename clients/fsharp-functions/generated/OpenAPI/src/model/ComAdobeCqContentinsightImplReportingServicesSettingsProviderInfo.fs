namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties

module ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo =

  //#region ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo

  [<CLIMutable>]
  type ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties;
  }

  //#endregion
