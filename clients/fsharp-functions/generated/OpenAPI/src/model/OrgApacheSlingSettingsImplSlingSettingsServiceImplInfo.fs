namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties

module OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo =

  //#region OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo

  [<CLIMutable>]
  type OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties;
  }

  //#endregion
