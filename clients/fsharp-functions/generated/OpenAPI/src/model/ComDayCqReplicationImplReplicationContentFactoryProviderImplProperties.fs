namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties =

  //#region ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties

  [<CLIMutable>]
  type ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties = {
    [<JsonProperty(PropertyName = "replication.content.useFileStorage")>]
    ReplicationContentUseFileStorage : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "replication.content.maxCommitAttempts")>]
    ReplicationContentMaxCommitAttempts : ConfigNodePropertyInteger;
  }

  //#endregion
