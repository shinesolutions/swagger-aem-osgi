# OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FelixMemoryusageDumpThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**FelixMemoryusageDumpInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**FelixMemoryusageDumpLocation** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties = Initialize-PSOpenAPIToolsOrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties  -FelixMemoryusageDumpThreshold null `
 -FelixMemoryusageDumpInterval null `
 -FelixMemoryusageDumpLocation null
```

- Convert the resource to JSON
```powershell
$OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

