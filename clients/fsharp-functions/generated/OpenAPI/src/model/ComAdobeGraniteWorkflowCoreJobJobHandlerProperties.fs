namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteWorkflowCoreJobJobHandlerProperties =

  //#region ComAdobeGraniteWorkflowCoreJobJobHandlerProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCoreJobJobHandlerProperties = {
    [<JsonProperty(PropertyName = "job.topics")>]
    JobTopics : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "allow.self.process.termination")>]
    AllowSelfProcessTermination : ConfigNodePropertyBoolean;
  }

  //#endregion
