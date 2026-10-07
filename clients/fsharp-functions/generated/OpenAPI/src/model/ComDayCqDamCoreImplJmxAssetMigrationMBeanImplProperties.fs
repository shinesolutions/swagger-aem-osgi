namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties =

  //#region ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties = {
    [<JsonProperty(PropertyName = "jmx.objectname")>]
    JmxObjectname : ConfigNodePropertyString;
  }

  //#endregion
