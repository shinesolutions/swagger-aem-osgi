namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplRenditionMakerImplProperties =

  //#region ComDayCqDamCoreImplRenditionMakerImplProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplRenditionMakerImplProperties = {
    [<JsonProperty(PropertyName = "xmp.propagate")>]
    XmpPropagate : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "xmp.excludes")>]
    XmpExcludes : ConfigNodePropertyArray;
  }

  //#endregion
