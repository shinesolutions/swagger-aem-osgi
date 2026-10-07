namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties =

  //#region OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties = {
    [<JsonProperty(PropertyName = "whitelist.name")>]
    WhitelistName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "whitelist.bundles")>]
    WhitelistBundles : ConfigNodePropertyArray;
  }

  //#endregion
