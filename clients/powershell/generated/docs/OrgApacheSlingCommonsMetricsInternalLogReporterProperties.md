# OrgApacheSlingCommonsMetricsInternalLogReporterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TimeUnit** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**Level** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**LoggerName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Prefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Pattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RegistryName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingCommonsMetricsInternalLogReporterProperties = Initialize-PSOpenAPIToolsOrgApacheSlingCommonsMetricsInternalLogReporterProperties  -Period null `
 -TimeUnit null `
 -Level null `
 -LoggerName null `
 -Prefix null `
 -Pattern null `
 -RegistryName null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingCommonsMetricsInternalLogReporterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

