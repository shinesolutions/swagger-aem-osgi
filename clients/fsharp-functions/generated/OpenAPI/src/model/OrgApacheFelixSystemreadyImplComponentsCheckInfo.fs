namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheFelixSystemreadyImplComponentsCheckProperties

module OrgApacheFelixSystemreadyImplComponentsCheckInfo =

  //#region OrgApacheFelixSystemreadyImplComponentsCheckInfo

  [<CLIMutable>]
  type OrgApacheFelixSystemreadyImplComponentsCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheFelixSystemreadyImplComponentsCheckProperties;
  }

  //#endregion
