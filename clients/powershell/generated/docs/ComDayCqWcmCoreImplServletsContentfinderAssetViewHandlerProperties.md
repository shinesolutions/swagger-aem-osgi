# ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DamShowexpired** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DamShowhidden** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**TagTitleSearch** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GuessTotal** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DamExpiryProperty** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties = Initialize-PSOpenAPIToolsComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties  -DamShowexpired null `
 -DamShowhidden null `
 -TagTitleSearch null `
 -GuessTotal null `
 -DamExpiryProperty null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

