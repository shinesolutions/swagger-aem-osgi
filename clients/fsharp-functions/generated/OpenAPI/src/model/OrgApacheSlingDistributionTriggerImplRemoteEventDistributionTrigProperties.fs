namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties =

  //#region OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "endpoint")>]
    Endpoint : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "transportSecretProvider.target")>]
    TransportSecretProviderTarget : ConfigNodePropertyString;
  }

  //#endregion
