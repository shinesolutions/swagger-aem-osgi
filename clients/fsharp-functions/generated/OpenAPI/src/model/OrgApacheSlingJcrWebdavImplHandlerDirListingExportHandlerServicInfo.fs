namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties

module OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo =

  //#region OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo

  [<CLIMutable>]
  type OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties;
  }

  //#endregion
