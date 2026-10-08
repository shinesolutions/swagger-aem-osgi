# ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PayloadMoveWhiteList** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PayloadMoveHandleFromWorkflowProcess** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties = Initialize-PSOpenAPIToolsComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties  -PayloadMoveWhiteList null `
 -PayloadMoveHandleFromWorkflowProcess null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

