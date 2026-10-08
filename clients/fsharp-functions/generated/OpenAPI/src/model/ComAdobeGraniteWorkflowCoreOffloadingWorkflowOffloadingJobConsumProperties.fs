namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties =

  //#region ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties = {
    [<JsonProperty(PropertyName = "job.topics")>]
    JobTopics : ConfigNodePropertyString;
  }

  //#endregion
