namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties

module OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo =

  //#region OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo

  [<CLIMutable>]
  type OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties;
  }

  //#endregion
