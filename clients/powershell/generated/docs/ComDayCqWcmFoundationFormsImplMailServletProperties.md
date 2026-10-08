# ComDayCqWcmFoundationFormsImplMailServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SlingServletResourceTypes** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SlingServletSelectors** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ResourceWhitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ResourceBlacklist** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmFoundationFormsImplMailServletProperties = Initialize-PSOpenAPIToolsComDayCqWcmFoundationFormsImplMailServletProperties  -SlingServletResourceTypes null `
 -SlingServletSelectors null `
 -ResourceWhitelist null `
 -ResourceBlacklist null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmFoundationFormsImplMailServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

