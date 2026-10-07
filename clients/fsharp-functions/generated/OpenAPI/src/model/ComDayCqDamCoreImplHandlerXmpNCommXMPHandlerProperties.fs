namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties =

  //#region ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties = {
    [<JsonProperty(PropertyName = "xmphandler.cq.formats")>]
    XmphandlerCqFormats : ConfigNodePropertyArray;
  }

  //#endregion
