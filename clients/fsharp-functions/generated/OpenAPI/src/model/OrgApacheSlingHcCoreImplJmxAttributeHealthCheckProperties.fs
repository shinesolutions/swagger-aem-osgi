namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties =

  //#region OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.name")>]
    HcName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "hc.mbean.name")>]
    HcMbeanName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "mbean.name")>]
    MbeanName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "attribute.name")>]
    AttributeName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "attribute.value.constraint")>]
    AttributeValueConstraint : ConfigNodePropertyString;
  }

  //#endregion
