namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties =

  //#region OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties


  type orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties = {
    Name : ConfigNodePropertyString;
    Path : ConfigNodePropertyString;
    IgnoredPathsPatterns : ConfigNodePropertyArray;
    ServiceName : ConfigNodePropertyString;
    Deep : ConfigNodePropertyBoolean;
  }
  //#endregion
