namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmCoreImplEventPagePostProcessorProperties

module ComDayCqWcmCoreImplEventPagePostProcessorInfo =

  //#region ComDayCqWcmCoreImplEventPagePostProcessorInfo

  [<CLIMutable>]
  type ComDayCqWcmCoreImplEventPagePostProcessorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmCoreImplEventPagePostProcessorProperties;
  }

  //#endregion
