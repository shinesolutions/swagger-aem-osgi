namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties =

  //#region ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties = {
    [<JsonProperty(PropertyName = "default.timeout")>]
    DefaultTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "max.timeout")>]
    MaxTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "default.period")>]
    DefaultPeriod : ConfigNodePropertyInteger;
  }

  //#endregion
