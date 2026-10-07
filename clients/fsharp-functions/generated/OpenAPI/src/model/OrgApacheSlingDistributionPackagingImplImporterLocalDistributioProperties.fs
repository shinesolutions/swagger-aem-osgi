namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties =

  //#region OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "packageBuilder.target")>]
    PackageBuilderTarget : ConfigNodePropertyString;
  }

  //#endregion
