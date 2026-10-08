namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties =

  //#region ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties

  [<CLIMutable>]
  type ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties = {
    [<JsonProperty(PropertyName = "upgradeTaskIgnoreList")>]
    UpgradeTaskIgnoreList : ConfigNodePropertyArray;
  }

  //#endregion
