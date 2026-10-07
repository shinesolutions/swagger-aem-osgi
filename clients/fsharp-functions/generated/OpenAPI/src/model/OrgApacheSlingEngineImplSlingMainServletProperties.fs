namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEngineImplSlingMainServletProperties =

  //#region OrgApacheSlingEngineImplSlingMainServletProperties

  [<CLIMutable>]
  type OrgApacheSlingEngineImplSlingMainServletProperties = {
    [<JsonProperty(PropertyName = "sling.max.calls")>]
    SlingMaxCalls : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "sling.max.inclusions")>]
    SlingMaxInclusions : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "sling.trace.allow")>]
    SlingTraceAllow : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "sling.max.record.requests")>]
    SlingMaxRecordRequests : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "sling.store.pattern.requests")>]
    SlingStorePatternRequests : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sling.serverinfo")>]
    SlingServerinfo : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.additional.response.headers")>]
    SlingAdditionalResponseHeaders : ConfigNodePropertyArray;
  }

  //#endregion
