namespace OpenAPI.Model

open System
open System.Collections.Generic

module ConfigNodePropertyInteger =

  //#region ConfigNodePropertyInteger


  type configNodePropertyInteger = {
    Name : string;
    Optional : bool;
    IsSet : bool;
    Type : int;
    Value : int;
    Description : string;
  }
  //#endregion
