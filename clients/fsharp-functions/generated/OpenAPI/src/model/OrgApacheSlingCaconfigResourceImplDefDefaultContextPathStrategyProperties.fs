namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties =

  //#region OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties

  [<CLIMutable>]
  type OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "configRefResourceNames")>]
    ConfigRefResourceNames : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "configRefPropertyNames")>]
    ConfigRefPropertyNames : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
  }

  //#endregion
