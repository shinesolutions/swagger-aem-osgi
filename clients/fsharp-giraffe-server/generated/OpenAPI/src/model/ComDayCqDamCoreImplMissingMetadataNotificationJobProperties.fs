namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplMissingMetadataNotificationJobProperties =

  //#region ComDayCqDamCoreImplMissingMetadataNotificationJobProperties


  type comDayCqDamCoreImplMissingMetadataNotificationJobProperties = {
    CqDamMissingmetadataNotificationSchedulerIstimebased : ConfigNodePropertyBoolean;
    CqDamMissingmetadataNotificationSchedulerTimebasedRule : ConfigNodePropertyString;
    CqDamMissingmetadataNotificationSchedulerPeriodRule : ConfigNodePropertyInteger;
    CqDamMissingmetadataNotificationRecipient : ConfigNodePropertyString;
  }
  //#endregion
