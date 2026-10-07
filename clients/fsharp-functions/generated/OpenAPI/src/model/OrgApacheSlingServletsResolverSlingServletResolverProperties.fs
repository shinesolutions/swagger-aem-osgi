namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingServletsResolverSlingServletResolverProperties =

  //#region OrgApacheSlingServletsResolverSlingServletResolverProperties

  [<CLIMutable>]
  type OrgApacheSlingServletsResolverSlingServletResolverProperties = {
    [<JsonProperty(PropertyName = "servletresolver.servletRoot")>]
    ServletresolverServletRoot : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "servletresolver.cacheSize")>]
    ServletresolverCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "servletresolver.paths")>]
    ServletresolverPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "servletresolver.defaultExtensions")>]
    ServletresolverDefaultExtensions : ConfigNodePropertyArray;
  }

  //#endregion
