namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties =

  //#region OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties

  [<CLIMutable>]
  type OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
  }

  //#endregion
