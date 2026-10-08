# MessagingUserComponentFactoryInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarPid** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Properties** | [**MessagingUserComponentFactoryProperties**](MessagingUserComponentFactoryProperties.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MessagingUserComponentFactoryInfo = Initialize-PSOpenAPIToolsMessagingUserComponentFactoryInfo  -VarPid null `
 -Title null `
 -Description null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$MessagingUserComponentFactoryInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

