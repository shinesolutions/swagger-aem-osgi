namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties =

  //#region OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties

  [<CLIMutable>]
  type OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
  }

  //#endregion
