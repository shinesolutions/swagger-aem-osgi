namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties

module OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo =

  //#region OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo

  [<CLIMutable>]
  type OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties;
  }

  //#endregion
