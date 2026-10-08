namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqWcmCoreImplVersionPurgeTaskProperties =

  //#region ComDayCqWcmCoreImplVersionPurgeTaskProperties


  type comDayCqWcmCoreImplVersionPurgeTaskProperties = {
    VersionpurgePaths : ConfigNodePropertyArray;
    VersionpurgeRecursive : ConfigNodePropertyBoolean;
    VersionpurgeMaxVersions : ConfigNodePropertyInteger;
    VersionpurgeMinVersions : ConfigNodePropertyInteger;
    VersionpurgeMaxAgeDays : ConfigNodePropertyInteger;
  }
  //#endregion
