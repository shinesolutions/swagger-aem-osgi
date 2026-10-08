namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMcmImplMCMConfigurationProperties

module ComDayCqMcmImplMCMConfigurationInfo =

  //#region ComDayCqMcmImplMCMConfigurationInfo

  [<CLIMutable>]
  type ComDayCqMcmImplMCMConfigurationInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMcmImplMCMConfigurationProperties;
  }

  //#endregion
