namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties =

  //#region OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties


  type orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties = {
    SolrHttpUrl : ConfigNodePropertyString;
    SolrZkHost : ConfigNodePropertyString;
    SolrCollection : ConfigNodePropertyString;
    SolrSocketTimeout : ConfigNodePropertyInteger;
    SolrConnectionTimeout : ConfigNodePropertyInteger;
    SolrShardsNo : ConfigNodePropertyInteger;
    SolrReplicationFactor : ConfigNodePropertyInteger;
    SolrConfDir : ConfigNodePropertyString;
  }
  //#endregion
