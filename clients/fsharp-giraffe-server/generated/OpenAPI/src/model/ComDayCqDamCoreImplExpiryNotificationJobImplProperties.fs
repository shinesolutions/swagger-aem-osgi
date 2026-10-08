namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplExpiryNotificationJobImplProperties =

  //#region ComDayCqDamCoreImplExpiryNotificationJobImplProperties


  type comDayCqDamCoreImplExpiryNotificationJobImplProperties = {
    CqDamExpiryNotificationSchedulerIstimebased : ConfigNodePropertyBoolean;
    CqDamExpiryNotificationSchedulerTimebasedRule : ConfigNodePropertyString;
    CqDamExpiryNotificationSchedulerPeriodRule : ConfigNodePropertyInteger;
    SendEmail : ConfigNodePropertyBoolean;
    AssetExpiredLimit : ConfigNodePropertyInteger;
    PriorNotificationSeconds : ConfigNodePropertyInteger;
    CqDamExpiryNotificationUrlProtocol : ConfigNodePropertyString;
  }
  //#endregion
