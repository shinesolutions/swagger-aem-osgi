namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCrxSecurityTokenImplTokenCleanupTaskProperties =

  //#region ComDayCrxSecurityTokenImplTokenCleanupTaskProperties


  type comDayCrxSecurityTokenImplTokenCleanupTaskProperties = {
    EnableTokenCleanupTask : ConfigNodePropertyBoolean;
    SchedulerExpression : ConfigNodePropertyString;
    BatchSize : ConfigNodePropertyInteger;
  }
  //#endregion
