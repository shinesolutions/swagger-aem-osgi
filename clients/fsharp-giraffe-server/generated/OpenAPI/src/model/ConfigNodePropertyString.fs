namespace OpenAPI.Model

open System
open System.Collections.Generic

module ConfigNodePropertyString =

  //#region ConfigNodePropertyString


  type configNodePropertyString = {
    Name : string;
    Optional : bool;
    IsSet : bool;
    Type : int;
    Value : string;
    Description : string;
  }
  //#endregion
