namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties

module ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo =

  //#region ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo

  [<CLIMutable>]
  type ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties;
  }

  //#endregion
