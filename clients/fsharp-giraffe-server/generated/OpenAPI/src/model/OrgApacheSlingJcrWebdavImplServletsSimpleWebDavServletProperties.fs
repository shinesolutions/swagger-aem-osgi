namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties =

  //#region OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties


  type orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties = {
    DavRoot : ConfigNodePropertyString;
    DavCreateAbsoluteUri : ConfigNodePropertyBoolean;
    DavRealm : ConfigNodePropertyString;
    CollectionTypes : ConfigNodePropertyArray;
    FilterPrefixes : ConfigNodePropertyArray;
    FilterTypes : ConfigNodePropertyString;
    FilterUris : ConfigNodePropertyString;
    TypeCollections : ConfigNodePropertyString;
    TypeNoncollections : ConfigNodePropertyString;
    TypeContent : ConfigNodePropertyString;
  }
  //#endregion
