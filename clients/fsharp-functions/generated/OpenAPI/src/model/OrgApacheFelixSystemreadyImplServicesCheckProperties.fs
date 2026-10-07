namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown

module OrgApacheFelixSystemreadyImplServicesCheckProperties =

  //#region OrgApacheFelixSystemreadyImplServicesCheckProperties

  [<CLIMutable>]
  type OrgApacheFelixSystemreadyImplServicesCheckProperties = {
    [<JsonProperty(PropertyName = "services.list")>]
    ServicesList : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "type")>]
    Type : ConfigNodePropertyDropDown;
  }

  //#endregion
