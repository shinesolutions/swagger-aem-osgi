namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties =

  //#region OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "endpoints")>]
    Endpoints : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "pull.items")>]
    PullItems : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "packageBuilder.target")>]
    PackageBuilderTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "transportSecretProvider.target")>]
    TransportSecretProviderTarget : ConfigNodePropertyString;
  }

  //#endregion
