namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmCoreImplServletsThumbnailServletProperties

module ComDayCqWcmCoreImplServletsThumbnailServletInfo =

  //#region ComDayCqWcmCoreImplServletsThumbnailServletInfo

  [<CLIMutable>]
  type ComDayCqWcmCoreImplServletsThumbnailServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmCoreImplServletsThumbnailServletProperties;
  }

  //#endregion
