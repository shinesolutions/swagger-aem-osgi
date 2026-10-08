# ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatePreviewEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**UpdatePreviewEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**QueueSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**FolderPreviewRenditionRegex** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties  -CreatePreviewEnabled null `
 -UpdatePreviewEnabled null `
 -QueueSize null `
 -FolderPreviewRenditionRegex null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

