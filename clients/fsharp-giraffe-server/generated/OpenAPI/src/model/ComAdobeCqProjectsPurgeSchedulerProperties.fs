namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqProjectsPurgeSchedulerProperties =

  //#region ComAdobeCqProjectsPurgeSchedulerProperties


  type comAdobeCqProjectsPurgeSchedulerProperties = {
    ScheduledpurgeName : ConfigNodePropertyString;
    ScheduledpurgePurgeActive : ConfigNodePropertyBoolean;
    ScheduledpurgeTemplates : ConfigNodePropertyArray;
    ScheduledpurgePurgeGroups : ConfigNodePropertyBoolean;
    ScheduledpurgePurgeAssets : ConfigNodePropertyBoolean;
    ScheduledpurgeTerminateRunningWorkflows : ConfigNodePropertyBoolean;
    ScheduledpurgeDaysold : ConfigNodePropertyInteger;
    ScheduledpurgeSaveThreshold : ConfigNodePropertyInteger;
  }
  //#endregion
