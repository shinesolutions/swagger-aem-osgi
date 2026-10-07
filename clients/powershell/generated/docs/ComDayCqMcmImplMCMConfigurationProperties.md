# ComDayCqMcmImplMCMConfigurationProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExperienceIndirection** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**TouchpointIndirection** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqMcmImplMCMConfigurationProperties = Initialize-PSOpenAPIToolsComDayCqMcmImplMCMConfigurationProperties  -ExperienceIndirection null `
 -TouchpointIndirection null
```

- Convert the resource to JSON
```powershell
$ComDayCqMcmImplMCMConfigurationProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

