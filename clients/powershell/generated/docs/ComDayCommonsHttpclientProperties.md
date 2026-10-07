# ComDayCommonsHttpclientProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProxyEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ProxyHost** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProxyUser** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProxyPassword** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProxyNtlmHost** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProxyNtlmDomain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProxyExceptions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCommonsHttpclientProperties = Initialize-PSOpenAPIToolsComDayCommonsHttpclientProperties  -ProxyEnabled null `
 -ProxyHost null `
 -ProxyUser null `
 -ProxyPassword null `
 -ProxyNtlmHost null `
 -ProxyNtlmDomain null `
 -ProxyExceptions null
```

- Convert the resource to JSON
```powershell
$ComDayCommonsHttpclientProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

