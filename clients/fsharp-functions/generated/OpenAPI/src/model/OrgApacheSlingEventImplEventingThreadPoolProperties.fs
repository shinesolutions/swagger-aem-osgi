namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingEventImplEventingThreadPoolProperties =

  //#region OrgApacheSlingEventImplEventingThreadPoolProperties

  [<CLIMutable>]
  type OrgApacheSlingEventImplEventingThreadPoolProperties = {
    [<JsonProperty(PropertyName = "minPoolSize")>]
    MinPoolSize : ConfigNodePropertyInteger;
  }

  //#endregion
