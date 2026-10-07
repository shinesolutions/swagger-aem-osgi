namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteWorkflowCoreWorkflowConfigProperties =

  //#region ComAdobeGraniteWorkflowCoreWorkflowConfigProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCoreWorkflowConfigProperties = {
    [<JsonProperty(PropertyName = "cq.workflow.config.workflow.packages.root.path")>]
    CqWorkflowConfigWorkflowPackagesRootPath : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.workflow.config.workflow.process.legacy.mode")>]
    CqWorkflowConfigWorkflowProcessLegacyMode : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.workflow.config.allow.locking")>]
    CqWorkflowConfigAllowLocking : ConfigNodePropertyBoolean;
  }

  //#endregion
