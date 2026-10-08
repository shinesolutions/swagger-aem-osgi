namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties =

  //#region ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties

  [<CLIMutable>]
  type ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties = {
    [<JsonProperty(PropertyName = "cq.searchpromote.configuration.server.uri")>]
    CqSearchpromoteConfigurationServerUri : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.searchpromote.configuration.environment")>]
    CqSearchpromoteConfigurationEnvironment : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "connection.timeout")>]
    ConnectionTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "socket.timeout")>]
    SocketTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
