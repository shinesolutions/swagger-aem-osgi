namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties =

  //#region ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties


  type comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties = {
    PreserveHierarchyNodes : ConfigNodePropertyBoolean;
    IgnoreVersioning : ConfigNodePropertyBoolean;
    ImportAcl : ConfigNodePropertyBoolean;
    SaveThreshold : ConfigNodePropertyInteger;
    PreserveUserPaths : ConfigNodePropertyBoolean;
    PreserveUuid : ConfigNodePropertyBoolean;
    PreserveUuidNodetypes : ConfigNodePropertyArray;
    PreserveUuidSubtrees : ConfigNodePropertyArray;
    AutoCommit : ConfigNodePropertyBoolean;
  }
  //#endregion
