namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties =

  //#region OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties

  [<CLIMutable>]
  type OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties = {
    [<JsonProperty(PropertyName = "users")>]
    Users : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "groups")>]
    Groups : ConfigNodePropertyArray;
  }

  //#endregion
