namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties

module OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo =

  //#region OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo

  [<CLIMutable>]
  type OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties;
  }

  //#endregion
