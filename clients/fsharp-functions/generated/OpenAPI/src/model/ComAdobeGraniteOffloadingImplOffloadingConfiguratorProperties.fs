namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties =

  //#region ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties

  [<CLIMutable>]
  type ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties = {
    [<JsonProperty(PropertyName = "offloading.transporter")>]
    OffloadingTransporter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "offloading.cleanup.payload")>]
    OffloadingCleanupPayload : ConfigNodePropertyBoolean;
  }

  //#endregion
