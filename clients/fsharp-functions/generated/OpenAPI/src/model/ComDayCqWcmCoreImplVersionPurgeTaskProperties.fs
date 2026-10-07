namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqWcmCoreImplVersionPurgeTaskProperties =

  //#region ComDayCqWcmCoreImplVersionPurgeTaskProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplVersionPurgeTaskProperties = {
    [<JsonProperty(PropertyName = "versionpurge.paths")>]
    VersionpurgePaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "versionpurge.recursive")>]
    VersionpurgeRecursive : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "versionpurge.maxVersions")>]
    VersionpurgeMaxVersions : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "versionpurge.minVersions")>]
    VersionpurgeMinVersions : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "versionpurge.maxAgeDays")>]
    VersionpurgeMaxAgeDays : ConfigNodePropertyInteger;
  }

  //#endregion
