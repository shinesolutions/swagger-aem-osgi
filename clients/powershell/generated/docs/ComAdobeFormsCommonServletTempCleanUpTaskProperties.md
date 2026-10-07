# ComAdobeFormsCommonServletTempCleanUpTaskProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SchedulerExpression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DurationForTemporaryStorage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DurationForAnonymousStorage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeFormsCommonServletTempCleanUpTaskProperties = Initialize-PSOpenAPIToolsComAdobeFormsCommonServletTempCleanUpTaskProperties  -SchedulerExpression null `
 -DurationForTemporaryStorage null `
 -DurationForAnonymousStorage null
```

- Convert the resource to JSON
```powershell
$ComAdobeFormsCommonServletTempCleanUpTaskProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

