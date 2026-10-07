namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplServletResourceCollectionServletProperties =

  //#region ComDayCqDamCoreImplServletResourceCollectionServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletResourceCollectionServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.resourceTypes")>]
    SlingServletResourceTypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sling.servlet.methods")>]
    SlingServletMethods : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.selectors")>]
    SlingServletSelectors : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "download.config")>]
    DownloadConfig : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "view.selector")>]
    ViewSelector : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "send_email")>]
    SendEmail : ConfigNodePropertyBoolean;
  }

  //#endregion
