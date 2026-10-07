namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties =

  //#region ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties

  [<CLIMutable>]
  type ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties = {
    [<JsonProperty(PropertyName = "preserve.hierarchy.nodes")>]
    PreserveHierarchyNodes : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "ignore.versioning")>]
    IgnoreVersioning : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "import.acl")>]
    ImportAcl : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "save.threshold")>]
    SaveThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "preserve.user.paths")>]
    PreserveUserPaths : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "preserve.uuid")>]
    PreserveUuid : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "preserve.uuid.nodetypes")>]
    PreserveUuidNodetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "preserve.uuid.subtrees")>]
    PreserveUuidSubtrees : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "auto.commit")>]
    AutoCommit : ConfigNodePropertyBoolean;
  }

  //#endregion
