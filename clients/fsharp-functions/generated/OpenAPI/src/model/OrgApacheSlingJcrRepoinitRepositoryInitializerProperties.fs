namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module OrgApacheSlingJcrRepoinitRepositoryInitializerProperties =

  //#region OrgApacheSlingJcrRepoinitRepositoryInitializerProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrRepoinitRepositoryInitializerProperties = {
    [<JsonProperty(PropertyName = "references")>]
    References : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "scripts")>]
    Scripts : ConfigNodePropertyArray;
  }

  //#endregion
