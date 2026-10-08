namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties =

  //#region OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "ignoredPathsPatterns")>]
    IgnoredPathsPatterns : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "serviceName")>]
    ServiceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "deep")>]
    Deep : ConfigNodePropertyBoolean;
  }

  //#endregion
