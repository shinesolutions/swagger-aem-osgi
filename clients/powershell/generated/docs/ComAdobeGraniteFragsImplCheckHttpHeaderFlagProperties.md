# ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeatureName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FeatureDescription** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HttpHeaderName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HttpHeaderValuepattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties = Initialize-PSOpenAPIToolsComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties  -FeatureName null `
 -FeatureDescription null `
 -HttpHeaderName null `
 -HttpHeaderValuepattern null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

