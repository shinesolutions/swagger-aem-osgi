namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplLightboxLightboxServletProperties =

  //#region ComDayCqDamCoreImplLightboxLightboxServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplLightboxLightboxServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.paths")>]
    SlingServletPaths : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.methods")>]
    SlingServletMethods : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.dam.enable.anonymous")>]
    CqDamEnableAnonymous : ConfigNodePropertyBoolean;
  }

  //#endregion
