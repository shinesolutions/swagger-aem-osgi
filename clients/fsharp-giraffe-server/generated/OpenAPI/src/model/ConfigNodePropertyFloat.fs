namespace OpenAPI.Model

open System
open System.Collections.Generic

module ConfigNodePropertyFloat =

  //#region ConfigNodePropertyFloat


  type configNodePropertyFloat = {
    Name : string;
    Optional : bool;
    IsSet : bool;
    Type : int;
    Value : decimal;
    Description : string;
  }
  //#endregion
