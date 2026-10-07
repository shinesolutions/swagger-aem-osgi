# ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RedirectEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**RedirectStatsEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**RedirectExtensions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**RedirectPaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties = Initialize-PSOpenAPIToolsComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties  -RedirectEnabled null `
 -RedirectStatsEnabled null `
 -RedirectExtensions null `
 -RedirectPaths null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

