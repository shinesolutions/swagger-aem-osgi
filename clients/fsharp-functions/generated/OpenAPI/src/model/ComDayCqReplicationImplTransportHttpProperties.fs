namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqReplicationImplTransportHttpProperties =

  //#region ComDayCqReplicationImplTransportHttpProperties

  [<CLIMutable>]
  type ComDayCqReplicationImplTransportHttpProperties = {
    [<JsonProperty(PropertyName = "disabled.cipher.suites")>]
    DisabledCipherSuites : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "enabled.cipher.suites")>]
    EnabledCipherSuites : ConfigNodePropertyArray;
  }

  //#endregion
