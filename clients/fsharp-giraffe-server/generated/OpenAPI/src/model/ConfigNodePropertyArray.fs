namespace OpenAPI.Model

open System
open System.Collections.Generic

module ConfigNodePropertyArray =

  //#region ConfigNodePropertyArray


  type configNodePropertyArray = {
    Name : string;
    Optional : bool;
    IsSet : bool;
    Type : int;
    Values : string[];
    Description : string;
  }
  //#endregion
