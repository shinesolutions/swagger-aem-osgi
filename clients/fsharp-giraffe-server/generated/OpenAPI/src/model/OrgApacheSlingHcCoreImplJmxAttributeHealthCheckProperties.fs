namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties =

  //#region OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties


  type orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties = {
    HcName : ConfigNodePropertyString;
    HcTags : ConfigNodePropertyArray;
    HcMbeanName : ConfigNodePropertyString;
    MbeanName : ConfigNodePropertyString;
    AttributeName : ConfigNodePropertyString;
    AttributeValueConstraint : ConfigNodePropertyString;
  }
  //#endregion
