namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties

module OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo =

  //#region OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties;
    [<JsonProperty(PropertyName = "additionalProperties")>]
    AdditionalProperties : string;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
