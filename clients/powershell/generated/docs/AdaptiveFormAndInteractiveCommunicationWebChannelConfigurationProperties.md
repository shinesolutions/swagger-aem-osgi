# AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ShowPlaceholder** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**MaximumCacheEntries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AfScriptingCompatversion** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**MakeFileNameUnique** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GeneratingCompliantData** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties = Initialize-PSOpenAPIToolsAdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties  -ShowPlaceholder null `
 -MaximumCacheEntries null `
 -AfScriptingCompatversion null `
 -MakeFileNameUnique null `
 -GeneratingCompliantData null
```

- Convert the resource to JSON
```powershell
$AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

