namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingHcCoreImplScriptableHealthCheckProperties =

  //#region OrgApacheSlingHcCoreImplScriptableHealthCheckProperties

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplScriptableHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.name")>]
    HcName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "hc.mbean.name")>]
    HcMbeanName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "expression")>]
    Expression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "language.extension")>]
    LanguageExtension : ConfigNodePropertyString;
  }

  //#endregion
