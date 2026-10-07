# ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ArchivingEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SchedulerExpression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ArchiveSinceDaysCompleted** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties = Initialize-PSOpenAPIToolsComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties  -ArchivingEnabled null `
 -SchedulerExpression null `
 -ArchiveSinceDaysCompleted null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

