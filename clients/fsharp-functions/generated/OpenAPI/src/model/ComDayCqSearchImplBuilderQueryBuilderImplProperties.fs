namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqSearchImplBuilderQueryBuilderImplProperties =

  //#region ComDayCqSearchImplBuilderQueryBuilderImplProperties

  [<CLIMutable>]
  type ComDayCqSearchImplBuilderQueryBuilderImplProperties = {
    [<JsonProperty(PropertyName = "excerpt.properties")>]
    ExcerptProperties : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cache.max.entries")>]
    CacheMaxEntries : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cache.entry.lifetime")>]
    CacheEntryLifetime : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "xpath.union")>]
    XpathUnion : ConfigNodePropertyBoolean;
  }

  //#endregion
