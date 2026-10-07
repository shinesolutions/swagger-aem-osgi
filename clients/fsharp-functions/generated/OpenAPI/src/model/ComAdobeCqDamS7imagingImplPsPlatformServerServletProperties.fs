namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties =

  //#region ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties

  [<CLIMutable>]
  type ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties = {
    [<JsonProperty(PropertyName = "cache.enable")>]
    CacheEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cache.rootPaths")>]
    CacheRootPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cache.maxSize")>]
    CacheMaxSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cache.maxEntries")>]
    CacheMaxEntries : ConfigNodePropertyInteger;
  }

  //#endregion
