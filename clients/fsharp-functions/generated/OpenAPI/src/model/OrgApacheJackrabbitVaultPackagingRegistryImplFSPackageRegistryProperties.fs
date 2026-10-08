namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties =

  //#region OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties = {
    [<JsonProperty(PropertyName = "homePath")>]
    HomePath : ConfigNodePropertyString;
  }

  //#endregion
