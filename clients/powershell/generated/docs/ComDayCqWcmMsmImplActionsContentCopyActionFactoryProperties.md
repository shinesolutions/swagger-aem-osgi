# ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqWcmMsmActionExcludednodetypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CqWcmMsmActionExcludedparagraphitems** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CqWcmMsmActionExcludedprops** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ContentcopyactionOrderStyle** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties = Initialize-PSOpenAPIToolsComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties  -CqWcmMsmActionExcludednodetypes null `
 -CqWcmMsmActionExcludedparagraphitems null `
 -CqWcmMsmActionExcludedprops null `
 -ContentcopyactionOrderStyle null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

