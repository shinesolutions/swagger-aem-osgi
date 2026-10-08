namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplMissingMetadataNotificationJobProperties =

  //#region ComDayCqDamCoreImplMissingMetadataNotificationJobProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplMissingMetadataNotificationJobProperties = {
    [<JsonProperty(PropertyName = "cq.dam.missingmetadata.notification.scheduler.istimebased")>]
    CqDamMissingmetadataNotificationSchedulerIstimebased : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.dam.missingmetadata.notification.scheduler.timebased.rule")>]
    CqDamMissingmetadataNotificationSchedulerTimebasedRule : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.missingmetadata.notification.scheduler.period.rule")>]
    CqDamMissingmetadataNotificationSchedulerPeriodRule : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.missingmetadata.notification.recipient")>]
    CqDamMissingmetadataNotificationRecipient : ConfigNodePropertyString;
  }

  //#endregion
