namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplLightboxLightboxServletProperties

module ComDayCqDamCoreImplLightboxLightboxServletInfo =

  //#region ComDayCqDamCoreImplLightboxLightboxServletInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplLightboxLightboxServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplLightboxLightboxServletProperties;
  }

  //#endregion
