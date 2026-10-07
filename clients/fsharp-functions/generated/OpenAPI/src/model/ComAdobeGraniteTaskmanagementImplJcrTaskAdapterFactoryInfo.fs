namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties

module ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo =

  //#region ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo

  [<CLIMutable>]
  type ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties;
  }

  //#endregion
