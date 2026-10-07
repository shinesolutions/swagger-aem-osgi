namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplServletMetadataGetServletProperties =

  //#region ComDayCqDamCoreImplServletMetadataGetServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletMetadataGetServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.resourceTypes")>]
    SlingServletResourceTypes : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.methods")>]
    SlingServletMethods : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.extensions")>]
    SlingServletExtensions : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.selectors")>]
    SlingServletSelectors : ConfigNodePropertyString;
  }

  //#endregion
