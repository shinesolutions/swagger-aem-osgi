namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties =

  //#region ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties


  type comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties = {
    EventFilter : ConfigNodePropertyString;
    MinThreadPoolSize : ConfigNodePropertyInteger;
    MaxThreadPoolSize : ConfigNodePropertyInteger;
    CqWcmWorkflowTerminateOnActivate : ConfigNodePropertyBoolean;
    CqWcmWorklfowTerminateExclusionList : ConfigNodePropertyArray;
  }
  //#endregion
