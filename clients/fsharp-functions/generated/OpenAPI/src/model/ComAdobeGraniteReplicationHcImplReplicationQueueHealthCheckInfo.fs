namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties

module ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo =

  //#region ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties;
  }

  //#endregion
