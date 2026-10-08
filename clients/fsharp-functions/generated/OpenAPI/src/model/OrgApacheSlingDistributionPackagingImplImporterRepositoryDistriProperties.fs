namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties =

  //#region OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "service.name")>]
    ServiceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "privilege.name")>]
    PrivilegeName : ConfigNodePropertyString;
  }

  //#endregion
