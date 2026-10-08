namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module ConfigNodePropertyDropDownType =

  //#region ConfigNodePropertyDropDownType

  [<CLIMutable>]
  type ConfigNodePropertyDropDownType = {
    [<JsonProperty(PropertyName = "labels")>]
    Labels : AnyType;
    [<JsonProperty(PropertyName = "values")>]
    Values : AnyType;
  }

  //#endregion
