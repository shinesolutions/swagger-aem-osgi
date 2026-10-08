namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties =

  //#region ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties = {
    [<JsonProperty(PropertyName = "jmx.objectname")>]
    JmxObjectname : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "active")>]
    Active : ConfigNodePropertyBoolean;
  }

  //#endregion
