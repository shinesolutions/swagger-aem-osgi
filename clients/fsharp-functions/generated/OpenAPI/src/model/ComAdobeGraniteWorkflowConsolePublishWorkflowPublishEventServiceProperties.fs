namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties =

  //#region ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties = {
    [<JsonProperty(PropertyName = "granite.workflow.WorkflowPublishEventService.enabled")>]
    GraniteWorkflowWorkflowPublishEventServiceEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
