namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCommonsHttpclientProperties =

  //#region ComDayCommonsHttpclientProperties

  [<CLIMutable>]
  type ComDayCommonsHttpclientProperties = {
    [<JsonProperty(PropertyName = "proxy.enabled")>]
    ProxyEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "proxy.host")>]
    ProxyHost : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "proxy.user")>]
    ProxyUser : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "proxy.password")>]
    ProxyPassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "proxy.ntlm.host")>]
    ProxyNtlmHost : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "proxy.ntlm.domain")>]
    ProxyNtlmDomain : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "proxy.exceptions")>]
    ProxyExceptions : ConfigNodePropertyArray;
  }

  //#endregion
