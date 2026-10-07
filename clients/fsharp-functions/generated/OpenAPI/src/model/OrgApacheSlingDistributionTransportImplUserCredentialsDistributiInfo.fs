namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties

module OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo =

  //#region OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties;
  }

  //#endregion
