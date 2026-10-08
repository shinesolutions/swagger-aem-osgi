# ComDayCqDamCoreImplExpiryNotificationJobImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqDamExpiryNotificationSchedulerIstimebased** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CqDamExpiryNotificationSchedulerTimebasedRule** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqDamExpiryNotificationSchedulerPeriodRule** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SendEmail** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AssetExpiredLimit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PriorNotificationSeconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqDamExpiryNotificationUrlProtocol** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplExpiryNotificationJobImplProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplExpiryNotificationJobImplProperties  -CqDamExpiryNotificationSchedulerIstimebased null `
 -CqDamExpiryNotificationSchedulerTimebasedRule null `
 -CqDamExpiryNotificationSchedulerPeriodRule null `
 -SendEmail null `
 -AssetExpiredLimit null `
 -PriorNotificationSeconds null `
 -CqDamExpiryNotificationUrlProtocol null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplExpiryNotificationJobImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

