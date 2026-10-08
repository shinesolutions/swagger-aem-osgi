namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties

module OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo =

  //#region OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo

  [<CLIMutable>]
  type OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties;
  }

  //#endregion
