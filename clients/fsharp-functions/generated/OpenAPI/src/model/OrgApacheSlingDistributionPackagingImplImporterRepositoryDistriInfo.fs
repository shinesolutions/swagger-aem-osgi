namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties

module OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo =

  //#region OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties;
  }

  //#endregion
