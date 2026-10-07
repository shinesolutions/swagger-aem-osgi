namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteWorkflowPurgeSchedulerProperties =

  //#region ComAdobeGraniteWorkflowPurgeSchedulerProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowPurgeSchedulerProperties = {
    [<JsonProperty(PropertyName = "scheduledpurge.name")>]
    ScheduledpurgeName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "scheduledpurge.workflowStatus")>]
    ScheduledpurgeWorkflowStatus : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "scheduledpurge.modelIds")>]
    ScheduledpurgeModelIds : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "scheduledpurge.daysold")>]
    ScheduledpurgeDaysold : ConfigNodePropertyInteger;
  }

  //#endregion
