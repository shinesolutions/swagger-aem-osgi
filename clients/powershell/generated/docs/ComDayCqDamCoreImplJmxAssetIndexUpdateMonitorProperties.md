# ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JmxObjectname** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PropertyMeasureEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PropertyName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PropertyMaxWaitMs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PropertyMaxRate** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 
**FulltextMeasureEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**FulltextName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FulltextMaxWaitMs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**FulltextMaxRate** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties  -JmxObjectname null `
 -PropertyMeasureEnabled null `
 -PropertyName null `
 -PropertyMaxWaitMs null `
 -PropertyMaxRate null `
 -FulltextMeasureEnabled null `
 -FulltextName null `
 -FulltextMaxWaitMs null `
 -FulltextMaxRate null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

