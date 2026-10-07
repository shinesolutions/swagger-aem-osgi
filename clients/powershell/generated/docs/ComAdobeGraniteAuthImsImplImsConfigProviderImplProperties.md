# ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OauthConfigmanagerImsConfigid** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ImsOwningEntity** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AemInstanceId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ImsServiceCode** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties = Initialize-PSOpenAPIToolsComAdobeGraniteAuthImsImplImsConfigProviderImplProperties  -OauthConfigmanagerImsConfigid null `
 -ImsOwningEntity null `
 -AemInstanceId null `
 -ImsServiceCode null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

