namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixJaasConfigurationSpiProperties =

  //#region OrgApacheFelixJaasConfigurationSpiProperties


  type orgApacheFelixJaasConfigurationSpiProperties = {
    JaasDefaultRealmName : ConfigNodePropertyString;
    JaasConfigProviderName : ConfigNodePropertyString;
    JaasGlobalConfigPolicy : ConfigNodePropertyDropDown;
  }
  //#endregion
