namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties =

  //#region ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties

  [<CLIMutable>]
  type ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties = {
    [<JsonProperty(PropertyName = "forcelocation")>]
    Forcelocation : ConfigNodePropertyBoolean;
  }

  //#endregion
