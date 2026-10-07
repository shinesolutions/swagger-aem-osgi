namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteWorkflowPurgeSchedulerProperties

module ComAdobeGraniteWorkflowPurgeSchedulerInfo =

  //#region ComAdobeGraniteWorkflowPurgeSchedulerInfo

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowPurgeSchedulerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteWorkflowPurgeSchedulerProperties;
  }

  //#endregion
