namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module OrgApacheSlingCaconfigImplConfigurationResolverImplProperties =

  //#region OrgApacheSlingCaconfigImplConfigurationResolverImplProperties

  [<CLIMutable>]
  type OrgApacheSlingCaconfigImplConfigurationResolverImplProperties = {
    [<JsonProperty(PropertyName = "configBucketNames")>]
    ConfigBucketNames : ConfigNodePropertyArray;
  }

  //#endregion
