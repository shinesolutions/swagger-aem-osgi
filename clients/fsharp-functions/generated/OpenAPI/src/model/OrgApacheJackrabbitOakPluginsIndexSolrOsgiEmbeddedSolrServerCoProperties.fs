namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties =

  //#region OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties = {
    [<JsonProperty(PropertyName = "solr.home.path")>]
    SolrHomePath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "solr.core.name")>]
    SolrCoreName : ConfigNodePropertyString;
  }

  //#endregion
