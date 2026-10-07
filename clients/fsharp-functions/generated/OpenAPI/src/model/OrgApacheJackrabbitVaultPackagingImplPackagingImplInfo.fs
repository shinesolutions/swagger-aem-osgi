namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties

module OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo =

  //#region OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties;
  }

  //#endregion
