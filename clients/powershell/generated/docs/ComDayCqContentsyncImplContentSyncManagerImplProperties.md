# ComDayCqContentsyncImplContentSyncManagerImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContentsyncFallbackAuthorizable** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ContentsyncFallbackUpdateuser** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqContentsyncImplContentSyncManagerImplProperties = Initialize-PSOpenAPIToolsComDayCqContentsyncImplContentSyncManagerImplProperties  -ContentsyncFallbackAuthorizable null `
 -ContentsyncFallbackUpdateuser null
```

- Convert the resource to JSON
```powershell
$ComDayCqContentsyncImplContentSyncManagerImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

