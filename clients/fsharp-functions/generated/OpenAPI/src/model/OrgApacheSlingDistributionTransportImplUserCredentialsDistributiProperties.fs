namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties =

  //#region OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "username")>]
    Username : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "password")>]
    Password : ConfigNodePropertyString;
  }

  //#endregion
