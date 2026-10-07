namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties

module ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo =

  //#region ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties;
  }

  //#endregion
