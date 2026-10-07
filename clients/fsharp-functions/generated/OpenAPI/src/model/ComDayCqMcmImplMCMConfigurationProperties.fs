namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqMcmImplMCMConfigurationProperties =

  //#region ComDayCqMcmImplMCMConfigurationProperties

  [<CLIMutable>]
  type ComDayCqMcmImplMCMConfigurationProperties = {
    [<JsonProperty(PropertyName = "experience.indirection")>]
    ExperienceIndirection : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "touchpoint.indirection")>]
    TouchpointIndirection : ConfigNodePropertyArray;
  }

  //#endregion
