namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties

module ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo =

  //#region ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo

  [<CLIMutable>]
  type ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties;
  }

  //#endregion
