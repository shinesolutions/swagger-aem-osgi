# ComDayCqDamCoreImplExpiryNotificationJobImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cq_dam_expiry_notification_scheduler_istimebased** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**cq_dam_expiry_notification_scheduler_timebased_rule** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**cq_dam_expiry_notification_scheduler_period_rule** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**send_email** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**asset_expired_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**prior_notification_seconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**cq_dam_expiry_notification_url_protocol** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ComDayCqDamCoreImplExpiryNotificationJobImplProperties } from './api';

const instance: ComDayCqDamCoreImplExpiryNotificationJobImplProperties = {
    cq_dam_expiry_notification_scheduler_istimebased,
    cq_dam_expiry_notification_scheduler_timebased_rule,
    cq_dam_expiry_notification_scheduler_period_rule,
    send_email,
    asset_expired_limit,
    prior_notification_seconds,
    cq_dam_expiry_notification_url_protocol,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
