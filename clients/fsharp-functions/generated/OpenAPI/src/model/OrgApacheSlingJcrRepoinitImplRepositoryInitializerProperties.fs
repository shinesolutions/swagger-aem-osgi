namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties =

  //#region OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties = {
    [<JsonProperty(PropertyName = "references")>]
    References : ConfigNodePropertyArray;
  }

  //#endregion
