namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingHapiImplHApiUtilImplProperties

module OrgApacheSlingHapiImplHApiUtilImplInfo =

  //#region OrgApacheSlingHapiImplHApiUtilImplInfo

  [<CLIMutable>]
  type OrgApacheSlingHapiImplHApiUtilImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingHapiImplHApiUtilImplProperties;
  }

  //#endregion
