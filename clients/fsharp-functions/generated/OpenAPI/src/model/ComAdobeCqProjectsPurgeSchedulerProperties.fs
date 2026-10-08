namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqProjectsPurgeSchedulerProperties =

  //#region ComAdobeCqProjectsPurgeSchedulerProperties

  [<CLIMutable>]
  type ComAdobeCqProjectsPurgeSchedulerProperties = {
    [<JsonProperty(PropertyName = "scheduledpurge.name")>]
    ScheduledpurgeName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "scheduledpurge.purgeActive")>]
    ScheduledpurgePurgeActive : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "scheduledpurge.templates")>]
    ScheduledpurgeTemplates : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "scheduledpurge.purgeGroups")>]
    ScheduledpurgePurgeGroups : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "scheduledpurge.purgeAssets")>]
    ScheduledpurgePurgeAssets : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "scheduledpurge.terminateRunningWorkflows")>]
    ScheduledpurgeTerminateRunningWorkflows : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "scheduledpurge.daysold")>]
    ScheduledpurgeDaysold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "scheduledpurge.saveThreshold")>]
    ScheduledpurgeSaveThreshold : ConfigNodePropertyInteger;
  }

  //#endregion
