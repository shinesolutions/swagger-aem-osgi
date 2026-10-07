namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEngineImplLogRequestLoggerServiceProperties =

  //#region OrgApacheSlingEngineImplLogRequestLoggerServiceProperties


  type orgApacheSlingEngineImplLogRequestLoggerServiceProperties = {
    RequestLogServiceFormat : ConfigNodePropertyString;
    RequestLogServiceOutput : ConfigNodePropertyString;
    RequestLogServiceOutputtype : ConfigNodePropertyDropDown;
    RequestLogServiceOnentry : ConfigNodePropertyBoolean;
  }
  //#endregion
