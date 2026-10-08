# OrgApacheSlingEngineImplLogRequestLoggerServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestLogServiceFormat** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RequestLogServiceOutput** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RequestLogServiceOutputtype** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**RequestLogServiceOnentry** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingEngineImplLogRequestLoggerServiceProperties = Initialize-PSOpenAPIToolsOrgApacheSlingEngineImplLogRequestLoggerServiceProperties  -RequestLogServiceFormat null `
 -RequestLogServiceOutput null `
 -RequestLogServiceOutputtype null `
 -RequestLogServiceOnentry null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingEngineImplLogRequestLoggerServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

