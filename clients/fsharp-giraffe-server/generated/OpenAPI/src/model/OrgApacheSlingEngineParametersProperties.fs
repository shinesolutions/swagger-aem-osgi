namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEngineParametersProperties =

  //#region OrgApacheSlingEngineParametersProperties


  type orgApacheSlingEngineParametersProperties = {
    SlingDefaultParameterEncoding : ConfigNodePropertyString;
    SlingDefaultMaxParameters : ConfigNodePropertyInteger;
    FileLocation : ConfigNodePropertyString;
    FileThreshold : ConfigNodePropertyInteger;
    FileMax : ConfigNodePropertyInteger;
    RequestMax : ConfigNodePropertyInteger;
    SlingDefaultParameterCheckForAdditionalContainerParameters : ConfigNodePropertyBoolean;
  }
  //#endregion
