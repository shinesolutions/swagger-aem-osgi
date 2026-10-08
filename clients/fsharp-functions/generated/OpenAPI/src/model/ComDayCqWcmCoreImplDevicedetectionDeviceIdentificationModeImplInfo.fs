namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties

module ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo =

  //#region ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo

  [<CLIMutable>]
  type ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties;
  }

  //#endregion
