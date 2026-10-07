namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties =

  //#region OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties = {
    [<JsonProperty(PropertyName = "persistentCacheIncludes")>]
    PersistentCacheIncludes : ConfigNodePropertyArray;
  }

  //#endregion
