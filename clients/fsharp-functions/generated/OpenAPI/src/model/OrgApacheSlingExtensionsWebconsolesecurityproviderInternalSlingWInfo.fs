namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties

module OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo =

  //#region OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo

  [<CLIMutable>]
  type OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties;
  }

  //#endregion
