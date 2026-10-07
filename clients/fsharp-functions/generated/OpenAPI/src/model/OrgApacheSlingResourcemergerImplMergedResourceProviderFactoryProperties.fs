namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties =

  //#region OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties

  [<CLIMutable>]
  type OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties = {
    [<JsonProperty(PropertyName = "merge.root")>]
    MergeRoot : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "merge.readOnly")>]
    MergeReadOnly : ConfigNodePropertyBoolean;
  }

  //#endregion
