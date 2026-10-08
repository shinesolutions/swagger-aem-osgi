namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConfigNodePropertyBoolean =

  //#region ConfigNodePropertyBoolean

  [<CLIMutable>]
  type ConfigNodePropertyBoolean = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "optional")>]
    Optional : bool;
    [<JsonProperty(PropertyName = "is_set")>]
    IsSet : bool;
    [<JsonProperty(PropertyName = "type")>]
    Type : int;
    [<JsonProperty(PropertyName = "value")>]
    Value : bool;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
  }

  //#endregion
