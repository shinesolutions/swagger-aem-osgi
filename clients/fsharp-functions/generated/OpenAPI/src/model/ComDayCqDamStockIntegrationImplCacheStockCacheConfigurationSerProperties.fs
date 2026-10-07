namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties =

  //#region ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties

  [<CLIMutable>]
  type ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties = {
    [<JsonProperty(PropertyName = "getCacheExpirationUnit")>]
    GetCacheExpirationUnit : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "getCacheExpirationValue")>]
    GetCacheExpirationValue : ConfigNodePropertyInteger;
  }

  //#endregion
