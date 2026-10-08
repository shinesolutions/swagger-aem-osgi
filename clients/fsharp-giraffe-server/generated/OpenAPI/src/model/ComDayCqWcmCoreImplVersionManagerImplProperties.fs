namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqWcmCoreImplVersionManagerImplProperties =

  //#region ComDayCqWcmCoreImplVersionManagerImplProperties


  type comDayCqWcmCoreImplVersionManagerImplProperties = {
    VersionmanagerCreateVersionOnActivation : ConfigNodePropertyBoolean;
    VersionmanagerPurgingEnabled : ConfigNodePropertyBoolean;
    VersionmanagerPurgePaths : ConfigNodePropertyArray;
    VersionmanagerIvPaths : ConfigNodePropertyArray;
    VersionmanagerMaxAgeDays : ConfigNodePropertyInteger;
    VersionmanagerMaxNumberVersions : ConfigNodePropertyInteger;
    VersionmanagerMinNumberVersions : ConfigNodePropertyInteger;
  }
  //#endregion
