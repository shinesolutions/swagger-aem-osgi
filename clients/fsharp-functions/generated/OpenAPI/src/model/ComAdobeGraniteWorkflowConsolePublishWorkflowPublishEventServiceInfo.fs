namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties

module ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo =

  //#region ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties;
  }

  //#endregion
