namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties =

  //#region ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties

  [<CLIMutable>]
  type ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "locale")>]
    Locale : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "imsConfig")>]
    ImsConfig : ConfigNodePropertyString;
  }

  //#endregion
