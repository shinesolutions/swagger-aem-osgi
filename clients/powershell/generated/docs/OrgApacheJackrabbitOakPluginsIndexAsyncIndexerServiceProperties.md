# OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AsyncConfigs** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**LeaseTimeOutMinutes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**FailingIndexTimeoutSeconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ErrorWarnIntervalSeconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties  -AsyncConfigs null `
 -LeaseTimeOutMinutes null `
 -FailingIndexTimeoutSeconds null `
 -ErrorWarnIntervalSeconds null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

