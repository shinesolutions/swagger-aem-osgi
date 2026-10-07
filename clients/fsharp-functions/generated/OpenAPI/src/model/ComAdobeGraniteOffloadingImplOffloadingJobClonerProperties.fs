namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties =

  //#region ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties

  [<CLIMutable>]
  type ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties = {
    [<JsonProperty(PropertyName = "offloading.jobcloner.enabled")>]
    OffloadingJobclonerEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
