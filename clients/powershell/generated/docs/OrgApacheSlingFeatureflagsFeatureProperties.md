# OrgApacheSlingFeatureflagsFeatureProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Description** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingFeatureflagsFeatureProperties = Initialize-PSOpenAPIToolsOrgApacheSlingFeatureflagsFeatureProperties  -Name null `
 -Description null `
 -Enabled null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingFeatureflagsFeatureProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

