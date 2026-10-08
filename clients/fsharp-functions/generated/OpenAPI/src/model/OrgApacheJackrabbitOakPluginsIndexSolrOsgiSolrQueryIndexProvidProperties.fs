namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties =

  //#region OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties = {
    [<JsonProperty(PropertyName = "query.aggregation")>]
    QueryAggregation : ConfigNodePropertyBoolean;
  }

  //#endregion
