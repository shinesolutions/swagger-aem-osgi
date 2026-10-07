namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties =

  //#region ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties

  [<CLIMutable>]
  type ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties = {
    [<JsonProperty(PropertyName = "pre-upgrade.maintenance.tasks")>]
    PreUpgradeMaintenanceTasks : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "pre-upgrade.hc.tags")>]
    PreUpgradeHcTags : ConfigNodePropertyArray;
  }

  //#endregion
