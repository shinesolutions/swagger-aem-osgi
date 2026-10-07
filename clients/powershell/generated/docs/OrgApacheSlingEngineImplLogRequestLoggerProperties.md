# OrgApacheSlingEngineImplLogRequestLoggerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestLogOutput** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RequestLogOutputtype** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**RequestLogEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AccessLogOutput** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AccessLogOutputtype** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**AccessLogEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingEngineImplLogRequestLoggerProperties = Initialize-PSOpenAPIToolsOrgApacheSlingEngineImplLogRequestLoggerProperties  -RequestLogOutput null `
 -RequestLogOutputtype null `
 -RequestLogEnabled null `
 -AccessLogOutput null `
 -AccessLogOutputtype null `
 -AccessLogEnabled null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingEngineImplLogRequestLoggerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

