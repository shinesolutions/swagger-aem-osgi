namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplServletDamContentDispositionFilterProperties =

  //#region ComDayCqDamCoreImplServletDamContentDispositionFilterProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletDamContentDispositionFilterProperties = {
    [<JsonProperty(PropertyName = "cq.mime.type.blacklist")>]
    CqMimeTypeBlacklist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.dam.empty.mime")>]
    CqDamEmptyMime : ConfigNodePropertyBoolean;
  }

  //#endregion
