namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEngineImplLogRequestLoggerProperties =

  //#region OrgApacheSlingEngineImplLogRequestLoggerProperties

  [<CLIMutable>]
  type OrgApacheSlingEngineImplLogRequestLoggerProperties = {
    [<JsonProperty(PropertyName = "request.log.output")>]
    RequestLogOutput : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "request.log.outputtype")>]
    RequestLogOutputtype : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "request.log.enabled")>]
    RequestLogEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "access.log.output")>]
    AccessLogOutput : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "access.log.outputtype")>]
    AccessLogOutputtype : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "access.log.enabled")>]
    AccessLogEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
