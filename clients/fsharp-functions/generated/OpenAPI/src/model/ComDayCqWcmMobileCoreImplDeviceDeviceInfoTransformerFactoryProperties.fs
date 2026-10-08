namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties =

  //#region ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties

  [<CLIMutable>]
  type ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties = {
    [<JsonProperty(PropertyName = "device.info.transformer.enabled")>]
    DeviceInfoTransformerEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "device.info.transformer.css.style")>]
    DeviceInfoTransformerCssStyle : ConfigNodePropertyString;
  }

  //#endregion
