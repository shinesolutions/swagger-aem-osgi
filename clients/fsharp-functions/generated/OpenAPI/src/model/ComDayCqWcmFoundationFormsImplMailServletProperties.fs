namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmFoundationFormsImplMailServletProperties =

  //#region ComDayCqWcmFoundationFormsImplMailServletProperties

  [<CLIMutable>]
  type ComDayCqWcmFoundationFormsImplMailServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.resourceTypes")>]
    SlingServletResourceTypes : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.selectors")>]
    SlingServletSelectors : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "resource.whitelist")>]
    ResourceWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "resource.blacklist")>]
    ResourceBlacklist : ConfigNodePropertyString;
  }

  //#endregion
