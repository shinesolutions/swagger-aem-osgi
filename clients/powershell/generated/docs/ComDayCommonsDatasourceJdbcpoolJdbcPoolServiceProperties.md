# ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JdbcDriverClass** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JdbcConnectionUri** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JdbcUsername** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JdbcPassword** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JdbcValidationQuery** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultReadonly** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DefaultAutocommit** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PoolMaxWaitMsec** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DatasourceName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DatasourceSvcProperties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties = Initialize-PSOpenAPIToolsComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties  -JdbcDriverClass null `
 -JdbcConnectionUri null `
 -JdbcUsername null `
 -JdbcPassword null `
 -JdbcValidationQuery null `
 -DefaultReadonly null `
 -DefaultAutocommit null `
 -PoolSize null `
 -PoolMaxWaitMsec null `
 -DatasourceName null `
 -DatasourceSvcProperties null
```

- Convert the resource to JSON
```powershell
$ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

