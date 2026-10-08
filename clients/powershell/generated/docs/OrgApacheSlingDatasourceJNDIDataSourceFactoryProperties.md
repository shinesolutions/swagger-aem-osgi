# OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DatasourceName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DatasourceSvcPropName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DatasourceJndiName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JndiProperties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties  -DatasourceName null `
 -DatasourceSvcPropName null `
 -DatasourceJndiName null `
 -JndiProperties null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

