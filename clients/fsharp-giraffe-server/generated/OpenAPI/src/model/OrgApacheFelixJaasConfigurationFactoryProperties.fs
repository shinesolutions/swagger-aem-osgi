namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixJaasConfigurationFactoryProperties =

  //#region OrgApacheFelixJaasConfigurationFactoryProperties


  type orgApacheFelixJaasConfigurationFactoryProperties = {
    JaasControlFlag : ConfigNodePropertyDropDown;
    JaasRanking : ConfigNodePropertyInteger;
    JaasRealmName : ConfigNodePropertyString;
    JaasClassname : ConfigNodePropertyString;
    JaasOptions : ConfigNodePropertyArray;
  }
  //#endregion
