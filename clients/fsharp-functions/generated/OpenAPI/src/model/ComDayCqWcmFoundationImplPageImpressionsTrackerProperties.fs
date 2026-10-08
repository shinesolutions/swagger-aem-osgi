namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmFoundationImplPageImpressionsTrackerProperties =

  //#region ComDayCqWcmFoundationImplPageImpressionsTrackerProperties

  [<CLIMutable>]
  type ComDayCqWcmFoundationImplPageImpressionsTrackerProperties = {
    [<JsonProperty(PropertyName = "sling.auth.requirements")>]
    SlingAuthRequirements : ConfigNodePropertyString;
  }

  //#endregion
