namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEngineImplSlingMainServletProperties =

  //#region OrgApacheSlingEngineImplSlingMainServletProperties


  type orgApacheSlingEngineImplSlingMainServletProperties = {
    SlingMaxCalls : ConfigNodePropertyInteger;
    SlingMaxInclusions : ConfigNodePropertyInteger;
    SlingTraceAllow : ConfigNodePropertyBoolean;
    SlingMaxRecordRequests : ConfigNodePropertyInteger;
    SlingStorePatternRequests : ConfigNodePropertyArray;
    SlingServerinfo : ConfigNodePropertyString;
    SlingAdditionalResponseHeaders : ConfigNodePropertyArray;
  }
  //#endregion
