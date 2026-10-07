namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties =

  //#region OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties

  [<CLIMutable>]
  type OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties = {
    [<JsonProperty(PropertyName = "extensions")>]
    Extensions : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "minDurationMs")>]
    MinDurationMs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxDurationMs")>]
    MaxDurationMs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "compactLogFormat")>]
    CompactLogFormat : ConfigNodePropertyBoolean;
  }

  //#endregion
