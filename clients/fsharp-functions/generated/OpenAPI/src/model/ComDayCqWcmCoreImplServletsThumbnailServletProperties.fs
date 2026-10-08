namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplServletsThumbnailServletProperties =

  //#region ComDayCqWcmCoreImplServletsThumbnailServletProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplServletsThumbnailServletProperties = {
    [<JsonProperty(PropertyName = "workspace")>]
    Workspace : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "dimensions")>]
    Dimensions : ConfigNodePropertyArray;
  }

  //#endregion
