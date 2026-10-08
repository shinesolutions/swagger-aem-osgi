namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown

module ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties =

  //#region ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties = {
    [<JsonProperty(PropertyName = "dim.default.mode")>]
    DimDefaultMode : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "dim.appcache.enabled")>]
    DimAppcacheEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
