namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties

module ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo =

  //#region ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties;
  }

  //#endregion
