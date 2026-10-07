# ComDayCqDamCoreImplServletResourceCollectionServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SlingServletResourceTypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SlingServletMethods** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SlingServletSelectors** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DownloadConfig** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ViewSelector** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SendEmail** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplServletResourceCollectionServletProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplServletResourceCollectionServletProperties  -SlingServletResourceTypes null `
 -SlingServletMethods null `
 -SlingServletSelectors null `
 -DownloadConfig null `
 -ViewSelector null `
 -SendEmail null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplServletResourceCollectionServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

