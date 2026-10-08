namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties =

  //#region OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties

  [<CLIMutable>]
  type OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "configPath")>]
    ConfigPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "fallbackPaths")>]
    FallbackPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "configCollectionInheritancePropertyNames")>]
    ConfigCollectionInheritancePropertyNames : ConfigNodePropertyArray;
  }

  //#endregion
