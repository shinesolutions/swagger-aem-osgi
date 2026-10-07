namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties

module ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo =

  //#region ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties;
  }

  //#endregion
