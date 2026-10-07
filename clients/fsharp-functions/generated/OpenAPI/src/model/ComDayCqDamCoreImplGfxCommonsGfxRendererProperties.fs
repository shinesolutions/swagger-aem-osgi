namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplGfxCommonsGfxRendererProperties =

  //#region ComDayCqDamCoreImplGfxCommonsGfxRendererProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplGfxCommonsGfxRendererProperties = {
    [<JsonProperty(PropertyName = "skip.bufferedcache")>]
    SkipBufferedcache : ConfigNodePropertyBoolean;
  }

  //#endregion
