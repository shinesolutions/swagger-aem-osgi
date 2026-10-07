# OrgApacheSlingDatasourceDataSourceFactoryProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasource_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**datasource_svc_prop_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**driverClassName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**username** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**defaultAutoCommit** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**defaultReadOnly** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**defaultTransactionIsolation** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**defaultCatalog** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**maxActive** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**maxIdle** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**minIdle** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**initialSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**maxWait** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**maxAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**testOnBorrow** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**testOnReturn** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**testWhileIdle** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**validationQuery** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**validationQueryTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**timeBetweenEvictionRunsMillis** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**minEvictableIdleTimeMillis** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**connectionProperties** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**initSQL** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**jdbcInterceptors** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**validationInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**logValidationErrors** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**datasource_svc_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]

## Example

```typescript
import { OrgApacheSlingDatasourceDataSourceFactoryProperties } from './api';

const instance: OrgApacheSlingDatasourceDataSourceFactoryProperties = {
    datasource_name,
    datasource_svc_prop_name,
    driverClassName,
    url,
    username,
    password,
    defaultAutoCommit,
    defaultReadOnly,
    defaultTransactionIsolation,
    defaultCatalog,
    maxActive,
    maxIdle,
    minIdle,
    initialSize,
    maxWait,
    maxAge,
    testOnBorrow,
    testOnReturn,
    testWhileIdle,
    validationQuery,
    validationQueryTimeout,
    timeBetweenEvictionRunsMillis,
    minEvictableIdleTimeMillis,
    connectionProperties,
    initSQL,
    jdbcInterceptors,
    validationInterval,
    logValidationErrors,
    datasource_svc_properties,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
