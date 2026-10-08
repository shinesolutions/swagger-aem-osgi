namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties =

  //#region ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties

  [<CLIMutable>]
  type ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties = {
    [<JsonProperty(PropertyName = "archiving.enabled")>]
    ArchivingEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "archive.since.days.completed")>]
    ArchiveSinceDaysCompleted : ConfigNodePropertyInteger;
  }

  //#endregion
