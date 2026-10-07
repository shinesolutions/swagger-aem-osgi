namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties =

  //#region OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties


  type orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties = {
    Name : ConfigNodePropertyString;
    Endpoints : ConfigNodePropertyArray;
    PullItems : ConfigNodePropertyInteger;
    PackageBuilderTarget : ConfigNodePropertyString;
    TransportSecretProviderTarget : ConfigNodePropertyString;
  }
  //#endregion
