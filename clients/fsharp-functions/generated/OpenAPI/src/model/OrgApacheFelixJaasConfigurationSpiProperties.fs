namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixJaasConfigurationSpiProperties =

  //#region OrgApacheFelixJaasConfigurationSpiProperties

  [<CLIMutable>]
  type OrgApacheFelixJaasConfigurationSpiProperties = {
    [<JsonProperty(PropertyName = "jaas.defaultRealmName")>]
    JaasDefaultRealmName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jaas.configProviderName")>]
    JaasConfigProviderName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jaas.globalConfigPolicy")>]
    JaasGlobalConfigPolicy : ConfigNodePropertyDropDown;
  }

  //#endregion
