# ComDayCqDamIdsImplIDSJobProcessorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EnableMultisession** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**IdsCcEnable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**EnableRetry** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**EnableRetryScripterror** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ExternalizerDomainCqhost** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ExternalizerDomainHttp** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamIdsImplIDSJobProcessorProperties = Initialize-PSOpenAPIToolsComDayCqDamIdsImplIDSJobProcessorProperties  -EnableMultisession null `
 -IdsCcEnable null `
 -EnableRetry null `
 -EnableRetryScripterror null `
 -ExternalizerDomainCqhost null `
 -ExternalizerDomainHttp null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamIdsImplIDSJobProcessorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

