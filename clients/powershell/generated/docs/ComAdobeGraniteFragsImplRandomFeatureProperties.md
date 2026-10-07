# ComAdobeGraniteFragsImplRandomFeatureProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeatureName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FeatureDescription** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ActivePercentage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CookieName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CookieMaxAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteFragsImplRandomFeatureProperties = Initialize-PSOpenAPIToolsComAdobeGraniteFragsImplRandomFeatureProperties  -FeatureName null `
 -FeatureDescription null `
 -ActivePercentage null `
 -CookieName null `
 -CookieMaxAge null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteFragsImplRandomFeatureProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

