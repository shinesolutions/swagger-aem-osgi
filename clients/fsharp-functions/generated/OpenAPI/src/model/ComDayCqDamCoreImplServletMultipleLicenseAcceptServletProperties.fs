namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties =

  //#region ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties = {
    [<JsonProperty(PropertyName = "cq.dam.drm.enable")>]
    CqDamDrmEnable : ConfigNodePropertyBoolean;
  }

  //#endregion
