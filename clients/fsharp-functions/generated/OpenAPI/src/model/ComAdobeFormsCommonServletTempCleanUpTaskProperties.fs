namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeFormsCommonServletTempCleanUpTaskProperties =

  //#region ComAdobeFormsCommonServletTempCleanUpTaskProperties

  [<CLIMutable>]
  type ComAdobeFormsCommonServletTempCleanUpTaskProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "Duration for Temporary Storage")>]
    DurationForTemporaryStorage : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "Duration for Anonymous Storage")>]
    DurationForAnonymousStorage : ConfigNodePropertyString;
  }

  //#endregion
