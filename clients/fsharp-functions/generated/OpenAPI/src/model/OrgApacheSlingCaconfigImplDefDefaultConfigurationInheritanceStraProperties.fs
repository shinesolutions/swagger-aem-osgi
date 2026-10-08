namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties =

  //#region OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties

  [<CLIMutable>]
  type OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "configPropertyInheritancePropertyNames")>]
    ConfigPropertyInheritancePropertyNames : ConfigNodePropertyArray;
  }

  //#endregion
