# ComAdobeCqHistoryImplHistoryRequestFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HistoryRequestFilterExcludedSelectors** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**HistoryRequestFilterExcludedExtensions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqHistoryImplHistoryRequestFilterProperties = Initialize-PSOpenAPIToolsComAdobeCqHistoryImplHistoryRequestFilterProperties  -HistoryRequestFilterExcludedSelectors null `
 -HistoryRequestFilterExcludedExtensions null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqHistoryImplHistoryRequestFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

