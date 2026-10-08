namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmCoreImplServletsFindReplaceServletProperties =

  //#region ComDayCqWcmCoreImplServletsFindReplaceServletProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplServletsFindReplaceServletProperties = {
    [<JsonProperty(PropertyName = "scope")>]
    Scope : ConfigNodePropertyArray;
  }

  //#endregion
