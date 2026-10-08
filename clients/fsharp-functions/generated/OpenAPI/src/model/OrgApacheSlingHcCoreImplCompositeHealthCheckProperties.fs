namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingHcCoreImplCompositeHealthCheckProperties =

  //#region OrgApacheSlingHcCoreImplCompositeHealthCheckProperties

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplCompositeHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.name")>]
    HcName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "hc.mbean.name")>]
    HcMbeanName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "filter.tags")>]
    FilterTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "filter.combineTagsWithOr")>]
    FilterCombineTagsWithOr : ConfigNodePropertyBoolean;
  }

  //#endregion
