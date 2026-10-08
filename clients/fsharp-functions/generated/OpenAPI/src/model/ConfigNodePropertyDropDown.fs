namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.ConfigNodePropertyDropDownType

module ConfigNodePropertyDropDown =

  //#region ConfigNodePropertyDropDown

  [<CLIMutable>]
  type ConfigNodePropertyDropDown = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "optional")>]
    Optional : bool;
    [<JsonProperty(PropertyName = "is_set")>]
    IsSet : bool;
    [<JsonProperty(PropertyName = "type")>]
    Type : ConfigNodePropertyDropDownType;
    [<JsonProperty(PropertyName = "value")>]
    Value : AnyType;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
  }

  //#endregion
