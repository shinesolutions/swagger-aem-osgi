namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties

module ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo =

  //#region ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo

  [<CLIMutable>]
  type ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties;
  }

  //#endregion
