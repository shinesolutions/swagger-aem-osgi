namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties =

  //#region ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties

  [<CLIMutable>]
  type ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties = {
    [<JsonProperty(PropertyName = "hc.name")>]
    HcName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "hc.mbean.name")>]
    HcMbeanName : ConfigNodePropertyString;
  }

  //#endregion
