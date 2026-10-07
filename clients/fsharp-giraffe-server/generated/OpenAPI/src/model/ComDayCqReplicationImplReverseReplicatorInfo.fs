namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ComDayCqReplicationImplReverseReplicatorProperties

module ComDayCqReplicationImplReverseReplicatorInfo =

  //#region ComDayCqReplicationImplReverseReplicatorInfo


  type comDayCqReplicationImplReverseReplicatorInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : ComDayCqReplicationImplReverseReplicatorProperties;
    AdditionalProperties : string;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
