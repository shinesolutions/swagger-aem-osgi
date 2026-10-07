namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties =

  //#region ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties

  [<CLIMutable>]
  type ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties = {
    [<JsonProperty(PropertyName = "purgeCompleted")>]
    PurgeCompleted : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "completedAge")>]
    CompletedAge : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "purgeActive")>]
    PurgeActive : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "activeAge")>]
    ActiveAge : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "saveThreshold")>]
    SaveThreshold : ConfigNodePropertyInteger;
  }

  //#endregion
