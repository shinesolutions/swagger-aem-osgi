namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties

module ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo =

  //#region ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo

  [<CLIMutable>]
  type ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties;
  }

  //#endregion
