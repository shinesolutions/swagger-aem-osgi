namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingTracerInternalLogTracerProperties =

  //#region OrgApacheSlingTracerInternalLogTracerProperties


  type orgApacheSlingTracerInternalLogTracerProperties = {
    TracerSets : ConfigNodePropertyArray;
    Enabled : ConfigNodePropertyBoolean;
    ServletEnabled : ConfigNodePropertyBoolean;
    RecordingCacheSizeInMB : ConfigNodePropertyInteger;
    RecordingCacheDurationInSecs : ConfigNodePropertyInteger;
    RecordingCompressionEnabled : ConfigNodePropertyBoolean;
    GzipResponse : ConfigNodePropertyBoolean;
  }
  //#endregion
