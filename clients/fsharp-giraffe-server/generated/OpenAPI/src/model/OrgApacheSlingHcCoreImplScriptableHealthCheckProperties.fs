namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingHcCoreImplScriptableHealthCheckProperties =

  //#region OrgApacheSlingHcCoreImplScriptableHealthCheckProperties


  type orgApacheSlingHcCoreImplScriptableHealthCheckProperties = {
    HcName : ConfigNodePropertyString;
    HcTags : ConfigNodePropertyArray;
    HcMbeanName : ConfigNodePropertyString;
    Expression : ConfigNodePropertyString;
    LanguageExtension : ConfigNodePropertyString;
  }
  //#endregion
