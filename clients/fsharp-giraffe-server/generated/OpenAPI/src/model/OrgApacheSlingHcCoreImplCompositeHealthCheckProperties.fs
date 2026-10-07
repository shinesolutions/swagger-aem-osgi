namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingHcCoreImplCompositeHealthCheckProperties =

  //#region OrgApacheSlingHcCoreImplCompositeHealthCheckProperties


  type orgApacheSlingHcCoreImplCompositeHealthCheckProperties = {
    HcName : ConfigNodePropertyString;
    HcTags : ConfigNodePropertyArray;
    HcMbeanName : ConfigNodePropertyString;
    FilterTags : ConfigNodePropertyArray;
    FilterCombineTagsWithOr : ConfigNodePropertyBoolean;
  }
  //#endregion
