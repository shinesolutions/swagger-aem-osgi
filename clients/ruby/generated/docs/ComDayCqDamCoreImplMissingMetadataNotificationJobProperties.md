# SwaggerAemOsgiClient::ComDayCqDamCoreImplMissingMetadataNotificationJobProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cq_dam_missingmetadata_notification_scheduler_istimebased** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **cq_dam_missingmetadata_notification_scheduler_timebased_rule** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **cq_dam_missingmetadata_notification_scheduler_period_rule** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cq_dam_missingmetadata_notification_recipient** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.new(
  cq_dam_missingmetadata_notification_scheduler_istimebased: null,
  cq_dam_missingmetadata_notification_scheduler_timebased_rule: null,
  cq_dam_missingmetadata_notification_scheduler_period_rule: null,
  cq_dam_missingmetadata_notification_recipient: null
)
```

