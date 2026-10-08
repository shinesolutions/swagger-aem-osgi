namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties =

  //#region OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties


  type orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties = {
    Extensions : ConfigNodePropertyArray;
    MinDurationMs : ConfigNodePropertyInteger;
    MaxDurationMs : ConfigNodePropertyInteger;
    CompactLogFormat : ConfigNodePropertyBoolean;
  }
  //#endregion
