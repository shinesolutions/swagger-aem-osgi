# OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**title** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**details** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**serviceName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**log_level** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**queue_processing_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**passiveQueues** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**packageExporter_endpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**packageImporter_endpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**retry_strategy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**retry_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**pull_items** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**http_conn_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**requestAuthorizationStrategy_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**transportSecretProvider_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**packageBuilder_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**triggers_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]

## Example

```typescript
import { OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties } from './api';

const instance: OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties = {
    name,
    title,
    details,
    enabled,
    serviceName,
    log_level,
    queue_processing_enabled,
    passiveQueues,
    packageExporter_endpoints,
    packageImporter_endpoints,
    retry_strategy,
    retry_attempts,
    pull_items,
    http_conn_timeout,
    requestAuthorizationStrategy_target,
    transportSecretProvider_target,
    packageBuilder_target,
    triggers_target,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
