namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ComDayCqReplicationAuditReplicationEventListenerProperties

module ComDayCqReplicationAuditReplicationEventListenerInfo =

  //#region ComDayCqReplicationAuditReplicationEventListenerInfo


  type comDayCqReplicationAuditReplicationEventListenerInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : ComDayCqReplicationAuditReplicationEventListenerProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
