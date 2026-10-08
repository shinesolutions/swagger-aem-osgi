namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties =

  //#region ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties

  [<CLIMutable>]
  type ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties = {
    [<JsonProperty(PropertyName = "adapter.condition")>]
    AdapterCondition : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "taskmanager.admingroups")>]
    TaskmanagerAdmingroups : ConfigNodePropertyArray;
  }

  //#endregion
