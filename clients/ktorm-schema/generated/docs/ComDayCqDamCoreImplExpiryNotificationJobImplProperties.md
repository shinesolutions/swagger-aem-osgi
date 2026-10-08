
# Table `comDayCqDamCoreImplExpiryNotificationJobImplProperties`
(mapped from: ComDayCqDamCoreImplExpiryNotificationJobImplProperties)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**cqDamExpiryNotificationSchedulerIstimebased** | cqdamexpirynotificationscheduleristimebased | long |  | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  |  [optional] [foreignkey]
**cqDamExpiryNotificationSchedulerTimebasedRule** | cqdamexpirynotificationschedulertimebasedrule | long |  | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  |  [optional] [foreignkey]
**cqDamExpiryNotificationSchedulerPeriodRule** | cqdamexpirynotificationschedulerperiodrule | long |  | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  |  [optional] [foreignkey]
**sendEmail** | send_email | long |  | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  |  [optional] [foreignkey]
**assetExpiredLimit** | asset_expired_limit | long |  | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  |  [optional] [foreignkey]
**priorNotificationSeconds** | prior_notification_seconds | long |  | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  |  [optional] [foreignkey]
**cqDamExpiryNotificationUrlProtocol** | cqdamexpirynotificationurlprotocol | long |  | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  |  [optional] [foreignkey]









