namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties =

  //#region ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
  }

  //#endregion
