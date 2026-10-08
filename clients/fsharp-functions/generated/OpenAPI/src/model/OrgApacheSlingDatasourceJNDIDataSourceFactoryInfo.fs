namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties

module OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo =

  //#region OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo

  [<CLIMutable>]
  type OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties;
  }

  //#endregion
