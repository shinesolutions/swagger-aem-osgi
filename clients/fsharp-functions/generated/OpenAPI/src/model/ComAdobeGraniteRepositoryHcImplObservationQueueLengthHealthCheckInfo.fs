namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties

module ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo =

  //#region ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties;
  }

  //#endregion
