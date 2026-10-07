# ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LinkExpiredPrefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LinkExpiredRemove** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**LinkExpiredSuffix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LinkInvalidPrefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LinkInvalidRemove** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**LinkInvalidSuffix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LinkPredatedPrefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LinkPredatedRemove** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**LinkPredatedSuffix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LinkWcmmodes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties = Initialize-PSOpenAPIToolsComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties  -LinkExpiredPrefix null `
 -LinkExpiredRemove null `
 -LinkExpiredSuffix null `
 -LinkInvalidPrefix null `
 -LinkInvalidRemove null `
 -LinkInvalidSuffix null `
 -LinkPredatedPrefix null `
 -LinkPredatedRemove null `
 -LinkPredatedSuffix null `
 -LinkWcmmodes null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

