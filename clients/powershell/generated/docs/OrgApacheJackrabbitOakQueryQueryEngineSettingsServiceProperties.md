# OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QueryLimitInMemory** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueryLimitReads** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueryFailTraversal** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**FastQuerySize** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties  -QueryLimitInMemory null `
 -QueryLimitReads null `
 -QueryFailTraversal null `
 -FastQuerySize null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

