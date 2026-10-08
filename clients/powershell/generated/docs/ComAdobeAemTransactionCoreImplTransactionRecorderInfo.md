# ComAdobeAemTransactionCoreImplTransactionRecorderInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarPid** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Properties** | [**ComAdobeAemTransactionCoreImplTransactionRecorderProperties**](ComAdobeAemTransactionCoreImplTransactionRecorderProperties.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeAemTransactionCoreImplTransactionRecorderInfo = Initialize-PSOpenAPIToolsComAdobeAemTransactionCoreImplTransactionRecorderInfo  -VarPid null `
 -Title null `
 -Description null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$ComAdobeAemTransactionCoreImplTransactionRecorderInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

