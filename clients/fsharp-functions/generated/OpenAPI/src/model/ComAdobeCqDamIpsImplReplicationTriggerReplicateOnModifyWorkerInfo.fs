namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties

module ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo =

  //#region ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo

  [<CLIMutable>]
  type ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties;
  }

  //#endregion
