# ComDayCqWcmUndoUndoConfigProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqWcmUndoEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CqWcmUndoPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqWcmUndoValidity** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqWcmUndoSteps** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqWcmUndoPersistence** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqWcmUndoPersistenceMode** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CqWcmUndoMarkermode** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqWcmUndoWhitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CqWcmUndoBlacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmUndoUndoConfigProperties = Initialize-PSOpenAPIToolsComDayCqWcmUndoUndoConfigProperties  -CqWcmUndoEnabled null `
 -CqWcmUndoPath null `
 -CqWcmUndoValidity null `
 -CqWcmUndoSteps null `
 -CqWcmUndoPersistence null `
 -CqWcmUndoPersistenceMode null `
 -CqWcmUndoMarkermode null `
 -CqWcmUndoWhitelist null `
 -CqWcmUndoBlacklist null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmUndoUndoConfigProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

