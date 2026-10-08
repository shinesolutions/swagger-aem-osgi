namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties =

  //#region ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties

  [<CLIMutable>]
  type ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties = {
    [<JsonProperty(PropertyName = "offloading.offloader.enabled")>]
    OffloadingOffloaderEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
