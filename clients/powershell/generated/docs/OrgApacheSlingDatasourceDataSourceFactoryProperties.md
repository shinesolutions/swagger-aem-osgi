# OrgApacheSlingDatasourceDataSourceFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DatasourceName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DatasourceSvcPropName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DriverClassName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Username** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultAutoCommit** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**DefaultReadOnly** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**DefaultTransactionIsolation** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**DefaultCatalog** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxActive** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxIdle** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MinIdle** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**InitialSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxWait** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TestOnBorrow** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**TestOnReturn** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**TestWhileIdle** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ValidationQuery** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ValidationQueryTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TimeBetweenEvictionRunsMillis** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MinEvictableIdleTimeMillis** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ConnectionProperties** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**InitSQL** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JdbcInterceptors** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ValidationInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**LogValidationErrors** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DatasourceSvcProperties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDatasourceDataSourceFactoryProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDatasourceDataSourceFactoryProperties  -DatasourceName null `
 -DatasourceSvcPropName null `
 -DriverClassName null `
 -Url null `
 -Username null `
 -Password null `
 -DefaultAutoCommit null `
 -DefaultReadOnly null `
 -DefaultTransactionIsolation null `
 -DefaultCatalog null `
 -MaxActive null `
 -MaxIdle null `
 -MinIdle null `
 -InitialSize null `
 -MaxWait null `
 -MaxAge null `
 -TestOnBorrow null `
 -TestOnReturn null `
 -TestWhileIdle null `
 -ValidationQuery null `
 -ValidationQueryTimeout null `
 -TimeBetweenEvictionRunsMillis null `
 -MinEvictableIdleTimeMillis null `
 -ConnectionProperties null `
 -InitSQL null `
 -JdbcInterceptors null `
 -ValidationInterval null `
 -LogValidationErrors null `
 -DatasourceSvcProperties null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDatasourceDataSourceFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

