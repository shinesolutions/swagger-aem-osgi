namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties

module OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo =

  //#region OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties;
  }

  //#endregion
