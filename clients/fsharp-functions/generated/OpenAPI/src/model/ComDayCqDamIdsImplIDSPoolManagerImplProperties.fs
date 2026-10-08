namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamIdsImplIDSPoolManagerImplProperties =

  //#region ComDayCqDamIdsImplIDSPoolManagerImplProperties

  [<CLIMutable>]
  type ComDayCqDamIdsImplIDSPoolManagerImplProperties = {
    [<JsonProperty(PropertyName = "max.errors.to.blacklist")>]
    MaxErrorsToBlacklist : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "retry.interval.to.whitelist")>]
    RetryIntervalToWhitelist : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "connect.timeout")>]
    ConnectTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "socket.timeout")>]
    SocketTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "process.label")>]
    ProcessLabel : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "connection.use.max")>]
    ConnectionUseMax : ConfigNodePropertyInteger;
  }

  //#endregion
