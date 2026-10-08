namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeFormsCommonServletTempCleanUpTaskProperties

module ComAdobeFormsCommonServletTempCleanUpTaskInfo =

  //#region ComAdobeFormsCommonServletTempCleanUpTaskInfo

  [<CLIMutable>]
  type ComAdobeFormsCommonServletTempCleanUpTaskInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeFormsCommonServletTempCleanUpTaskProperties;
  }

  //#endregion
