# ComDayCqDamInddProcessINDDMediaExtractProcessProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProcessLabel** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqDamInddPagesRegex** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**IdsJobDecoupled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**IdsJobWorkflowModel** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamInddProcessINDDMediaExtractProcessProperties = Initialize-PSOpenAPIToolsComDayCqDamInddProcessINDDMediaExtractProcessProperties  -ProcessLabel null `
 -CqDamInddPagesRegex null `
 -IdsJobDecoupled null `
 -IdsJobWorkflowModel null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamInddProcessINDDMediaExtractProcessProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

