namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties =

  //#region ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
