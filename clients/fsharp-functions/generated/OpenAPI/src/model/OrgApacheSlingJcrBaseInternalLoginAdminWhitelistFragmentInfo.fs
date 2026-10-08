namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties

module OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo =

  //#region OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo

  [<CLIMutable>]
  type OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties;
  }

  //#endregion
