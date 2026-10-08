namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteWorkflowCoreJobJobHandlerProperties

module ComAdobeGraniteWorkflowCoreJobJobHandlerInfo =

  //#region ComAdobeGraniteWorkflowCoreJobJobHandlerInfo

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCoreJobJobHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteWorkflowCoreJobJobHandlerProperties;
  }

  //#endregion
