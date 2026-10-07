namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties =

  //#region OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "endpoints")>]
    Endpoints : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "transportSecretProvider.target")>]
    TransportSecretProviderTarget : ConfigNodePropertyString;
  }

  //#endregion
