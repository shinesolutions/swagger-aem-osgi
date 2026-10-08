# ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PurgeCompleted** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CompletedAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PurgeActive** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ActiveAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SaveThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties = Initialize-PSOpenAPIToolsComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties  -PurgeCompleted null `
 -CompletedAge null `
 -PurgeActive null `
 -ActiveAge null `
 -SaveThreshold null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

