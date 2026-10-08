namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties =

  //#region OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties


  type orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties = {
    Enabled : ConfigNodePropertyBoolean;
    ConfigPath : ConfigNodePropertyString;
    FallbackPaths : ConfigNodePropertyArray;
    ConfigCollectionInheritancePropertyNames : ConfigNodePropertyArray;
  }
  //#endregion
