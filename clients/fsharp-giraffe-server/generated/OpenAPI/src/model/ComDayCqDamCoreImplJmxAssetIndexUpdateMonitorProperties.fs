namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyFloat
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties =

  //#region ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties


  type comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties = {
    JmxObjectname : ConfigNodePropertyString;
    PropertyMeasureEnabled : ConfigNodePropertyBoolean;
    PropertyName : ConfigNodePropertyString;
    PropertyMaxWaitMs : ConfigNodePropertyInteger;
    PropertyMaxRate : ConfigNodePropertyFloat;
    FulltextMeasureEnabled : ConfigNodePropertyBoolean;
    FulltextName : ConfigNodePropertyString;
    FulltextMaxWaitMs : ConfigNodePropertyInteger;
    FulltextMaxRate : ConfigNodePropertyFloat;
  }
  //#endregion
