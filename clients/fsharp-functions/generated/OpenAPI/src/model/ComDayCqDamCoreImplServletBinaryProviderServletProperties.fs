namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplServletBinaryProviderServletProperties =

  //#region ComDayCqDamCoreImplServletBinaryProviderServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletBinaryProviderServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.resourceTypes")>]
    SlingServletResourceTypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sling.servlet.methods")>]
    SlingServletMethods : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.dam.drm.enable")>]
    CqDamDrmEnable : ConfigNodePropertyBoolean;
  }

  //#endregion
