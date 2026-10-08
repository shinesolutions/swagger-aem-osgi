# ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServiceMaxLinksPerHost** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ServiceSaveExternalLinkReferences** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties = Initialize-PSOpenAPIToolsComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties  -ServiceMaxLinksPerHost null `
 -ServiceSaveExternalLinkReferences null
```

- Convert the resource to JSON
```powershell
$ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

