namespace OpenAPI.Model

open System
open System.Collections.Generic

module ConfigNodePropertyBoolean =

  //#region ConfigNodePropertyBoolean


  type configNodePropertyBoolean = {
    Name : string;
    Optional : bool;
    IsSet : bool;
    Type : int;
    Value : bool;
    Description : string;
  }
  //#endregion
