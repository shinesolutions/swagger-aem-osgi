# ComDayCqDamCoreImplServletCollectionServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqDamBatchCollectionProperties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CqDamBatchCollectionMaxcollections** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplServletCollectionServletProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplServletCollectionServletProperties  -CqDamBatchCollectionProperties null `
 -CqDamBatchCollectionMaxcollections null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplServletCollectionServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

