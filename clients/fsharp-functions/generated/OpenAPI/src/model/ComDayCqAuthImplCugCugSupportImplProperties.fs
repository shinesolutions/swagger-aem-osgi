namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqAuthImplCugCugSupportImplProperties =

  //#region ComDayCqAuthImplCugCugSupportImplProperties

  [<CLIMutable>]
  type ComDayCqAuthImplCugCugSupportImplProperties = {
    [<JsonProperty(PropertyName = "cug.exempted.principals")>]
    CugExemptedPrincipals : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cug.enabled")>]
    CugEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cug.principals.regex")>]
    CugPrincipalsRegex : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cug.principals.replacement")>]
    CugPrincipalsReplacement : ConfigNodePropertyString;
  }

  //#endregion
