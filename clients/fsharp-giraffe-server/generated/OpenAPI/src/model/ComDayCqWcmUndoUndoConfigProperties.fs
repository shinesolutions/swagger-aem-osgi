namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmUndoUndoConfigProperties =

  //#region ComDayCqWcmUndoUndoConfigProperties


  type comDayCqWcmUndoUndoConfigProperties = {
    CqWcmUndoEnabled : ConfigNodePropertyBoolean;
    CqWcmUndoPath : ConfigNodePropertyString;
    CqWcmUndoValidity : ConfigNodePropertyInteger;
    CqWcmUndoSteps : ConfigNodePropertyInteger;
    CqWcmUndoPersistence : ConfigNodePropertyString;
    CqWcmUndoPersistenceMode : ConfigNodePropertyBoolean;
    CqWcmUndoMarkermode : ConfigNodePropertyString;
    CqWcmUndoWhitelist : ConfigNodePropertyArray;
    CqWcmUndoBlacklist : ConfigNodePropertyArray;
  }
  //#endregion
