namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties

module OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo =

  //#region OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo

  [<CLIMutable>]
  type OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties;
  }

  //#endregion
