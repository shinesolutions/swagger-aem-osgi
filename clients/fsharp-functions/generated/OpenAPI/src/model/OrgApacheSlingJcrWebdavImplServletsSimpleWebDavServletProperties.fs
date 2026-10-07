namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties =

  //#region OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties = {
    [<JsonProperty(PropertyName = "dav.root")>]
    DavRoot : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "dav.create-absolute-uri")>]
    DavCreateAbsoluteUri : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "dav.realm")>]
    DavRealm : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "collection.types")>]
    CollectionTypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "filter.prefixes")>]
    FilterPrefixes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "filter.types")>]
    FilterTypes : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "filter.uris")>]
    FilterUris : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "type.collections")>]
    TypeCollections : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "type.noncollections")>]
    TypeNoncollections : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "type.content")>]
    TypeContent : ConfigNodePropertyString;
  }

  //#endregion
