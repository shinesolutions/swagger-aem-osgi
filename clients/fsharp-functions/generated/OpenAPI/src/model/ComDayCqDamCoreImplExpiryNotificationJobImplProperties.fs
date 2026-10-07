namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplExpiryNotificationJobImplProperties =

  //#region ComDayCqDamCoreImplExpiryNotificationJobImplProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplExpiryNotificationJobImplProperties = {
    [<JsonProperty(PropertyName = "cq.dam.expiry.notification.scheduler.istimebased")>]
    CqDamExpiryNotificationSchedulerIstimebased : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.dam.expiry.notification.scheduler.timebased.rule")>]
    CqDamExpiryNotificationSchedulerTimebasedRule : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.expiry.notification.scheduler.period.rule")>]
    CqDamExpiryNotificationSchedulerPeriodRule : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "send_email")>]
    SendEmail : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "asset_expired_limit")>]
    AssetExpiredLimit : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "prior_notification_seconds")>]
    PriorNotificationSeconds : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.expiry.notification.url.protocol")>]
    CqDamExpiryNotificationUrlProtocol : ConfigNodePropertyString;
  }

  //#endregion
