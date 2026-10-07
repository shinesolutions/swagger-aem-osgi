namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEngineImplLogRequestLoggerServiceProperties =

  //#region OrgApacheSlingEngineImplLogRequestLoggerServiceProperties

  [<CLIMutable>]
  type OrgApacheSlingEngineImplLogRequestLoggerServiceProperties = {
    [<JsonProperty(PropertyName = "request.log.service.format")>]
    RequestLogServiceFormat : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "request.log.service.output")>]
    RequestLogServiceOutput : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "request.log.service.outputtype")>]
    RequestLogServiceOutputtype : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "request.log.service.onentry")>]
    RequestLogServiceOnentry : ConfigNodePropertyBoolean;
  }

  //#endregion
