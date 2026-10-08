namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties =

  //#region OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties = {
    [<JsonProperty(PropertyName = "solr.http.url")>]
    SolrHttpUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "solr.zk.host")>]
    SolrZkHost : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "solr.collection")>]
    SolrCollection : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "solr.socket.timeout")>]
    SolrSocketTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "solr.connection.timeout")>]
    SolrConnectionTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "solr.shards.no")>]
    SolrShardsNo : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "solr.replication.factor")>]
    SolrReplicationFactor : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "solr.conf.dir")>]
    SolrConfDir : ConfigNodePropertyString;
  }

  //#endregion
