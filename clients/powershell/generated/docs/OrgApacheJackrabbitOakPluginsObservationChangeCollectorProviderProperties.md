# OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxItems** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxPathDepth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties  -MaxItems null `
 -MaxPathDepth null `
 -Enabled null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

