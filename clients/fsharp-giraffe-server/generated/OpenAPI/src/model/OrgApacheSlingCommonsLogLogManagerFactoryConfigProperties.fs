namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties =

  //#region OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties


  type orgApacheSlingCommonsLogLogManagerFactoryConfigProperties = {
    OrgApacheSlingCommonsLogLevel : ConfigNodePropertyDropDown;
    OrgApacheSlingCommonsLogFile : ConfigNodePropertyString;
    OrgApacheSlingCommonsLogPattern : ConfigNodePropertyString;
    OrgApacheSlingCommonsLogNames : ConfigNodePropertyArray;
    OrgApacheSlingCommonsLogAdditiv : ConfigNodePropertyBoolean;
  }
  //#endregion
