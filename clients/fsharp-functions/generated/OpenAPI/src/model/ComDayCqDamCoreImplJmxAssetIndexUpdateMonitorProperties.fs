namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyFloat
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties =

  //#region ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties = {
    [<JsonProperty(PropertyName = "jmx.objectname")>]
    JmxObjectname : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "property.measure.enabled")>]
    PropertyMeasureEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "property.name")>]
    PropertyName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "property.max.wait.ms")>]
    PropertyMaxWaitMs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "property.max.rate")>]
    PropertyMaxRate : ConfigNodePropertyFloat;
    [<JsonProperty(PropertyName = "fulltext.measure.enabled")>]
    FulltextMeasureEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "fulltext.name")>]
    FulltextName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "fulltext.max.wait.ms")>]
    FulltextMaxWaitMs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "fulltext.max.rate")>]
    FulltextMaxRate : ConfigNodePropertyFloat;
  }

  //#endregion
