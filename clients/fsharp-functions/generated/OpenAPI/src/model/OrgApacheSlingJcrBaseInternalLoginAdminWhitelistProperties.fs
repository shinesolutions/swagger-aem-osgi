namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties =

  //#region OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties = {
    [<JsonProperty(PropertyName = "whitelist.bypass")>]
    WhitelistBypass : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "whitelist.bundles.regexp")>]
    WhitelistBundlesRegexp : ConfigNodePropertyString;
  }

  //#endregion
