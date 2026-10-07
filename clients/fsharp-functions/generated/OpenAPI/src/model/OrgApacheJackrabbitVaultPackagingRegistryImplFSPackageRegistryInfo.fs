namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties

module OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo =

  //#region OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties;
  }

  //#endregion
