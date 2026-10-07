namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties =

  //#region OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties

  [<CLIMutable>]
  type OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties = {
    [<JsonProperty(PropertyName = "description")>]
    Description : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "overrides")>]
    Overrides : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
  }

  //#endregion
