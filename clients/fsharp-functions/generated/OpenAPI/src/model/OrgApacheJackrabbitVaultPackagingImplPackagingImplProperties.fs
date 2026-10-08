namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties =

  //#region OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties = {
    [<JsonProperty(PropertyName = "packageRoots")>]
    PackageRoots : ConfigNodePropertyArray;
  }

  //#endregion
