namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixJaasConfigurationFactoryProperties =

  //#region OrgApacheFelixJaasConfigurationFactoryProperties

  [<CLIMutable>]
  type OrgApacheFelixJaasConfigurationFactoryProperties = {
    [<JsonProperty(PropertyName = "jaas.controlFlag")>]
    JaasControlFlag : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "jaas.ranking")>]
    JaasRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "jaas.realmName")>]
    JaasRealmName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jaas.classname")>]
    JaasClassname : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jaas.options")>]
    JaasOptions : ConfigNodePropertyArray;
  }

  //#endregion
