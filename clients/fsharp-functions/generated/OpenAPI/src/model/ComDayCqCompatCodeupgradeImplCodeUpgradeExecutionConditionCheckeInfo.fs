namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties

module ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo =

  //#region ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo

  [<CLIMutable>]
  type ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties;
  }

  //#endregion
