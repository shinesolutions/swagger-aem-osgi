namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingAuthCoreImplLogoutServletProperties =

  //#region OrgApacheSlingAuthCoreImplLogoutServletProperties

  [<CLIMutable>]
  type OrgApacheSlingAuthCoreImplLogoutServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.methods")>]
    SlingServletMethods : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sling.servlet.paths")>]
    SlingServletPaths : ConfigNodePropertyString;
  }

  //#endregion
