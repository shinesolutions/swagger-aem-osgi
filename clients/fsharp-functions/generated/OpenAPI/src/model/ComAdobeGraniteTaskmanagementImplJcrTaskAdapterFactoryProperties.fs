namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties =

  //#region ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties

  [<CLIMutable>]
  type ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties = {
    [<JsonProperty(PropertyName = "adapter.condition")>]
    AdapterCondition : ConfigNodePropertyString;
  }

  //#endregion
