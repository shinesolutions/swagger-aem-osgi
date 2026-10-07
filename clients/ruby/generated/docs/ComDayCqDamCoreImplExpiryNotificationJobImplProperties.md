# SwaggerAemOsgiClient::ComDayCqDamCoreImplExpiryNotificationJobImplProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cq_dam_expiry_notification_scheduler_istimebased** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **cq_dam_expiry_notification_scheduler_timebased_rule** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **cq_dam_expiry_notification_scheduler_period_rule** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **send_email** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **asset_expired_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **prior_notification_seconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cq_dam_expiry_notification_url_protocol** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCqDamCoreImplExpiryNotificationJobImplProperties.new(
  cq_dam_expiry_notification_scheduler_istimebased: null,
  cq_dam_expiry_notification_scheduler_timebased_rule: null,
  cq_dam_expiry_notification_scheduler_period_rule: null,
  send_email: null,
  asset_expired_limit: null,
  prior_notification_seconds: null,
  cq_dam_expiry_notification_url_protocol: null
)
```

