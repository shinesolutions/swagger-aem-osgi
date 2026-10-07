# ComDayCqDamCoreImplMissingMetadataNotificationJobProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqDamMissingmetadataNotificationSchedulerIstimebased** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CqDamMissingmetadataNotificationSchedulerTimebasedRule** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqDamMissingmetadataNotificationSchedulerPeriodRule** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqDamMissingmetadataNotificationRecipient** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplMissingMetadataNotificationJobProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplMissingMetadataNotificationJobProperties  -CqDamMissingmetadataNotificationSchedulerIstimebased null `
 -CqDamMissingmetadataNotificationSchedulerTimebasedRule null `
 -CqDamMissingmetadataNotificationSchedulerPeriodRule null `
 -CqDamMissingmetadataNotificationRecipient null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplMissingMetadataNotificationJobProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

