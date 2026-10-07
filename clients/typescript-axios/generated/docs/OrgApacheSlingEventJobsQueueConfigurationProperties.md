# OrgApacheSlingEventJobsQueueConfigurationProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queue_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**queue_topics** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**queue_type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**queue_priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**queue_retries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**queue_retrydelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**queue_maxparallel** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] [default to undefined]
**queue_keepJobs** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**queue_preferRunOnCreationInstance** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**queue_threadPoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]

## Example

```typescript
import { OrgApacheSlingEventJobsQueueConfigurationProperties } from './api';

const instance: OrgApacheSlingEventJobsQueueConfigurationProperties = {
    queue_name,
    queue_topics,
    queue_type,
    queue_priority,
    queue_retries,
    queue_retrydelay,
    queue_maxparallel,
    queue_keepJobs,
    queue_preferRunOnCreationInstance,
    queue_threadPoolSize,
    service_ranking,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
