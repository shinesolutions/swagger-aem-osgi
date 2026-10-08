namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties

module ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo =

  //#region ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo

  [<CLIMutable>]
  type ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties;
  }

  //#endregion
