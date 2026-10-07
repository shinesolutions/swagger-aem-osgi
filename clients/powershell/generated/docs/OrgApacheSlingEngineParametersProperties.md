# OrgApacheSlingEngineParametersProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SlingDefaultParameterEncoding** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SlingDefaultMaxParameters** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**FileLocation** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FileThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**FileMax** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RequestMax** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SlingDefaultParameterCheckForAdditionalContainerParameters** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingEngineParametersProperties = Initialize-PSOpenAPIToolsOrgApacheSlingEngineParametersProperties  -SlingDefaultParameterEncoding null `
 -SlingDefaultMaxParameters null `
 -FileLocation null `
 -FileThreshold null `
 -FileMax null `
 -RequestMax null `
 -SlingDefaultParameterCheckForAdditionalContainerParameters null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingEngineParametersProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

