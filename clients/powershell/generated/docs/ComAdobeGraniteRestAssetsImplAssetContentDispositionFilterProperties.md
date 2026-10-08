# ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MimeAllowEmpty** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**MimeAllowed** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties = Initialize-PSOpenAPIToolsComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties  -MimeAllowEmpty null `
 -MimeAllowed null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

