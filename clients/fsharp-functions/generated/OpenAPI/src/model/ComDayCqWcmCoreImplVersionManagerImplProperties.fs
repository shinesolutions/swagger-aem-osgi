namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqWcmCoreImplVersionManagerImplProperties =

  //#region ComDayCqWcmCoreImplVersionManagerImplProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplVersionManagerImplProperties = {
    [<JsonProperty(PropertyName = "versionmanager.createVersionOnActivation")>]
    VersionmanagerCreateVersionOnActivation : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "versionmanager.purgingEnabled")>]
    VersionmanagerPurgingEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "versionmanager.purgePaths")>]
    VersionmanagerPurgePaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "versionmanager.ivPaths")>]
    VersionmanagerIvPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "versionmanager.maxAgeDays")>]
    VersionmanagerMaxAgeDays : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "versionmanager.maxNumberVersions")>]
    VersionmanagerMaxNumberVersions : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "versionmanager.minNumberVersions")>]
    VersionmanagerMinNumberVersions : ConfigNodePropertyInteger;
  }

  //#endregion
