namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties =

  //#region ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties

  [<CLIMutable>]
  type ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties = {
    [<JsonProperty(PropertyName = "codeupgradetasks")>]
    Codeupgradetasks : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "codeupgradetaskfilters")>]
    Codeupgradetaskfilters : ConfigNodePropertyArray;
  }

  //#endregion
