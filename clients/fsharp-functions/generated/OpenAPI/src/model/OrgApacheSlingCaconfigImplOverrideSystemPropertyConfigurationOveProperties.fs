namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties =

  //#region OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties

  [<CLIMutable>]
  type OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
  }

  //#endregion
