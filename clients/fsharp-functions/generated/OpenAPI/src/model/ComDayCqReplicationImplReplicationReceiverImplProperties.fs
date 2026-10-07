namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqReplicationImplReplicationReceiverImplProperties =

  //#region ComDayCqReplicationImplReplicationReceiverImplProperties

  [<CLIMutable>]
  type ComDayCqReplicationImplReplicationReceiverImplProperties = {
    [<JsonProperty(PropertyName = "receiver.tmpfile.threshold")>]
    ReceiverTmpfileThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "receiver.packages.use.install")>]
    ReceiverPackagesUseInstall : ConfigNodePropertyBoolean;
  }

  //#endregion
