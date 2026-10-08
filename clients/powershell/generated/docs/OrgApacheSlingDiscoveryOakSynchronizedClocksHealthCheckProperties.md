# OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HcName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**HcMbeanName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties  -HcName null `
 -HcTags null `
 -HcMbeanName null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

