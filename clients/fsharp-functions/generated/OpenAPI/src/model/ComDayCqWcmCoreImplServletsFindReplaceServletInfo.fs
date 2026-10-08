namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmCoreImplServletsFindReplaceServletProperties

module ComDayCqWcmCoreImplServletsFindReplaceServletInfo =

  //#region ComDayCqWcmCoreImplServletsFindReplaceServletInfo

  [<CLIMutable>]
  type ComDayCqWcmCoreImplServletsFindReplaceServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmCoreImplServletsFindReplaceServletProperties;
  }

  //#endregion
