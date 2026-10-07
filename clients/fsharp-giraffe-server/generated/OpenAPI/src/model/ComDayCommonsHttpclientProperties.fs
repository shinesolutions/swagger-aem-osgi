namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCommonsHttpclientProperties =

  //#region ComDayCommonsHttpclientProperties


  type comDayCommonsHttpclientProperties = {
    ProxyEnabled : ConfigNodePropertyBoolean;
    ProxyHost : ConfigNodePropertyString;
    ProxyUser : ConfigNodePropertyString;
    ProxyPassword : ConfigNodePropertyString;
    ProxyNtlmHost : ConfigNodePropertyString;
    ProxyNtlmDomain : ConfigNodePropertyString;
    ProxyExceptions : ConfigNodePropertyArray;
  }
  //#endregion
