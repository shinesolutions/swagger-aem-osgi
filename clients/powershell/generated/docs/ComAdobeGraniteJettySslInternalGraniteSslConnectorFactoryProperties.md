# ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ComAdobeGraniteJettySslPort** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ComAdobeGraniteJettySslKeystoreUser** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ComAdobeGraniteJettySslKeystorePassword** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ComAdobeGraniteJettySslCiphersuitesExcluded** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ComAdobeGraniteJettySslCiphersuitesIncluded** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ComAdobeGraniteJettySslClientCertificate** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties = Initialize-PSOpenAPIToolsComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties  -ComAdobeGraniteJettySslPort null `
 -ComAdobeGraniteJettySslKeystoreUser null `
 -ComAdobeGraniteJettySslKeystorePassword null `
 -ComAdobeGraniteJettySslCiphersuitesExcluded null `
 -ComAdobeGraniteJettySslCiphersuitesIncluded null `
 -ComAdobeGraniteJettySslClientCertificate null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

