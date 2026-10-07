namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties =

  //#region OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "type.collections")>]
    TypeCollections : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "type.noncollections")>]
    TypeNoncollections : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "type.content")>]
    TypeContent : ConfigNodePropertyString;
  }

  //#endregion
