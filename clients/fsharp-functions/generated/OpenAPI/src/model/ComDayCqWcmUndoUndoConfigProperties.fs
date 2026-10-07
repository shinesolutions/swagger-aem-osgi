namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmUndoUndoConfigProperties =

  //#region ComDayCqWcmUndoUndoConfigProperties

  [<CLIMutable>]
  type ComDayCqWcmUndoUndoConfigProperties = {
    [<JsonProperty(PropertyName = "cq.wcm.undo.enabled")>]
    CqWcmUndoEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.wcm.undo.path")>]
    CqWcmUndoPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.wcm.undo.validity")>]
    CqWcmUndoValidity : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.wcm.undo.steps")>]
    CqWcmUndoSteps : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.wcm.undo.persistence")>]
    CqWcmUndoPersistence : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.wcm.undo.persistence.mode")>]
    CqWcmUndoPersistenceMode : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.wcm.undo.markermode")>]
    CqWcmUndoMarkermode : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.wcm.undo.whitelist")>]
    CqWcmUndoWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.wcm.undo.blacklist")>]
    CqWcmUndoBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
