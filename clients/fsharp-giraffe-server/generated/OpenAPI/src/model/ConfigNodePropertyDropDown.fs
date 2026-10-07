namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.ConfigNodePropertyDropDownType

module ConfigNodePropertyDropDown =

  //#region ConfigNodePropertyDropDown


  type configNodePropertyDropDown = {
    Name : string;
    Optional : bool;
    IsSet : bool;
    Type : ConfigNodePropertyDropDownType;
    Value : AnyType;
    Description : string;
  }
  //#endregion
