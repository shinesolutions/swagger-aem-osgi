namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties =

  //#region ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties

  [<CLIMutable>]
  type ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties = {
    [<JsonProperty(PropertyName = "Flush agents")>]
    FlushAgents : ConfigNodePropertyArray;
  }

  //#endregion
