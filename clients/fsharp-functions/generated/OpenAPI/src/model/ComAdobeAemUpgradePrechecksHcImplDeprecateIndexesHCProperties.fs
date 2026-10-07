namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties =

  //#region ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties

  [<CLIMutable>]
  type ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties = {
    [<JsonProperty(PropertyName = "hc.name")>]
    HcName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "hc.mbean.name")>]
    HcMbeanName : ConfigNodePropertyString;
  }

  //#endregion
