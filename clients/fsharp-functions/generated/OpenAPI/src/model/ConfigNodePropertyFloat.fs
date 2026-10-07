namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConfigNodePropertyFloat =

  //#region ConfigNodePropertyFloat

  [<CLIMutable>]
  type ConfigNodePropertyFloat = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "optional")>]
    Optional : bool;
    [<JsonProperty(PropertyName = "is_set")>]
    IsSet : bool;
    [<JsonProperty(PropertyName = "type")>]
    Type : int;
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
  }

  //#endregion
