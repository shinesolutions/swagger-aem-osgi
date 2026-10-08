namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingTracerInternalLogTracerProperties =

  //#region OrgApacheSlingTracerInternalLogTracerProperties

  [<CLIMutable>]
  type OrgApacheSlingTracerInternalLogTracerProperties = {
    [<JsonProperty(PropertyName = "tracerSets")>]
    TracerSets : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "servletEnabled")>]
    ServletEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "recordingCacheSizeInMB")>]
    RecordingCacheSizeInMB : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "recordingCacheDurationInSecs")>]
    RecordingCacheDurationInSecs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "recordingCompressionEnabled")>]
    RecordingCompressionEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "gzipResponse")>]
    GzipResponse : ConfigNodePropertyBoolean;
  }

  //#endregion
