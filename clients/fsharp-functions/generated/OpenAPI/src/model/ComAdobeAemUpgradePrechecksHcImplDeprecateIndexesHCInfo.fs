namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties

module ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo =

  //#region ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo

  [<CLIMutable>]
  type ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties;
  }

  //#endregion
