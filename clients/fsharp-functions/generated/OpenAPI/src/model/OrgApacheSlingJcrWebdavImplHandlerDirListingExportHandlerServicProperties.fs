namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties =

  //#region OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
  }

  //#endregion
