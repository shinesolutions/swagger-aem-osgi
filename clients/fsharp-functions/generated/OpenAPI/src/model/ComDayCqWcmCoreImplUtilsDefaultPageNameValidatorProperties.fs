namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties =

  //#region ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties = {
    [<JsonProperty(PropertyName = "nonValidChars")>]
    NonValidChars : ConfigNodePropertyString;
  }

  //#endregion
