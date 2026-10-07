namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteWorkflowPurgeSchedulerProperties =

  //#region ComAdobeGraniteWorkflowPurgeSchedulerProperties


  type comAdobeGraniteWorkflowPurgeSchedulerProperties = {
    ScheduledpurgeName : ConfigNodePropertyString;
    ScheduledpurgeWorkflowStatus : ConfigNodePropertyDropDown;
    ScheduledpurgeModelIds : ConfigNodePropertyArray;
    ScheduledpurgeDaysold : ConfigNodePropertyInteger;
  }
  //#endregion
