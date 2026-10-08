namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties =

  //#region ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties

  [<CLIMutable>]
  type ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties = {
    [<JsonProperty(PropertyName = "dmreplicateonmodify.enabled")>]
    DmreplicateonmodifyEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "dmreplicateonmodify.forcesyncdeletes")>]
    DmreplicateonmodifyForcesyncdeletes : ConfigNodePropertyBoolean;
  }

  //#endregion
