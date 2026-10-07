namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingScriptingCoreImplScriptCacheImplProperties =

  //#region OrgApacheSlingScriptingCoreImplScriptCacheImplProperties

  [<CLIMutable>]
  type OrgApacheSlingScriptingCoreImplScriptCacheImplProperties = {
    [<JsonProperty(PropertyName = "org.apache.sling.scripting.cache.size")>]
    OrgApacheSlingScriptingCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.sling.scripting.cache.additional_extensions")>]
    OrgApacheSlingScriptingCacheAdditionalExtensions : ConfigNodePropertyArray;
  }

  //#endregion
