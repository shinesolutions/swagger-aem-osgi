namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEngineImplLogRequestLoggerProperties =

  //#region OrgApacheSlingEngineImplLogRequestLoggerProperties


  type orgApacheSlingEngineImplLogRequestLoggerProperties = {
    RequestLogOutput : ConfigNodePropertyString;
    RequestLogOutputtype : ConfigNodePropertyDropDown;
    RequestLogEnabled : ConfigNodePropertyBoolean;
    AccessLogOutput : ConfigNodePropertyString;
    AccessLogOutputtype : ConfigNodePropertyDropDown;
    AccessLogEnabled : ConfigNodePropertyBoolean;
  }
  //#endregion
