namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingHapiImplHApiUtilImplProperties =

  //#region OrgApacheSlingHapiImplHApiUtilImplProperties

  [<CLIMutable>]
  type OrgApacheSlingHapiImplHApiUtilImplProperties = {
    [<JsonProperty(PropertyName = "org.apache.sling.hapi.tools.resourcetype")>]
    OrgApacheSlingHapiToolsResourcetype : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.hapi.tools.collectionresourcetype")>]
    OrgApacheSlingHapiToolsCollectionresourcetype : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.hapi.tools.searchpaths")>]
    OrgApacheSlingHapiToolsSearchpaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.sling.hapi.tools.externalurl")>]
    OrgApacheSlingHapiToolsExternalurl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.hapi.tools.enabled")>]
    OrgApacheSlingHapiToolsEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
