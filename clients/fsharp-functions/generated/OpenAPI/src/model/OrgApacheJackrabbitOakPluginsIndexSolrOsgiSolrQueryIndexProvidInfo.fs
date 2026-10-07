namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties

module OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo =

  //#region OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties;
  }

  //#endregion
