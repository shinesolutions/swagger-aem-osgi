namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties =

  //#region ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties

  [<CLIMutable>]
  type ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties = {
    [<JsonProperty(PropertyName = "version.id")>]
    VersionId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cache.on")>]
    CacheOn : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "concurrency.level")>]
    ConcurrencyLevel : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cache.start.size")>]
    CacheStartSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cache.ttl")>]
    CacheTtl : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cache.size")>]
    CacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "time.limit")>]
    TimeLimit : ConfigNodePropertyInteger;
  }

  //#endregion
