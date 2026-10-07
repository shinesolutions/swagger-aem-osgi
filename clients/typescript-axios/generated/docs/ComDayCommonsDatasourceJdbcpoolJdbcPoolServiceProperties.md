# ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jdbc_driver_class** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**jdbc_connection_uri** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**jdbc_username** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**jdbc_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**jdbc_validation_query** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**default_readonly** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**default_autocommit** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**pool_max_wait_msec** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**datasource_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**datasource_svc_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties } from './api';

const instance: ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties = {
    jdbc_driver_class,
    jdbc_connection_uri,
    jdbc_username,
    jdbc_password,
    jdbc_validation_query,
    default_readonly,
    default_autocommit,
    pool_size,
    pool_max_wait_msec,
    datasource_name,
    datasource_svc_properties,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
