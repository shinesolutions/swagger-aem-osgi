namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties

module ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo =

  //#region ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo

  [<CLIMutable>]
  type ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties;
  }

  //#endregion
