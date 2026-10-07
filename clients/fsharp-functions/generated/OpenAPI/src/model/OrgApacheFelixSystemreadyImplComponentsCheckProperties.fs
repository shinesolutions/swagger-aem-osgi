namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown

module OrgApacheFelixSystemreadyImplComponentsCheckProperties =

  //#region OrgApacheFelixSystemreadyImplComponentsCheckProperties

  [<CLIMutable>]
  type OrgApacheFelixSystemreadyImplComponentsCheckProperties = {
    [<JsonProperty(PropertyName = "components.list")>]
    ComponentsList : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "type")>]
    Type : ConfigNodePropertyDropDown;
  }

  //#endregion
