namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ComDayCqWcmUndoUndoConfigProperties

module ComDayCqWcmUndoUndoConfigInfo =

  //#region ComDayCqWcmUndoUndoConfigInfo


  type comDayCqWcmUndoUndoConfigInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : ComDayCqWcmUndoUndoConfigProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
