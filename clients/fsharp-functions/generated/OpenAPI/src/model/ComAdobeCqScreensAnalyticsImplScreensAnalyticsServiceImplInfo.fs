namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties

module ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo =

  //#region ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo

  [<CLIMutable>]
  type ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties;
  }

  //#endregion
