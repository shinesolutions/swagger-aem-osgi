# ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OffloadingTransporter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OffloadingCleanupPayload** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties = Initialize-PSOpenAPIToolsComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties  -OffloadingTransporter null `
 -OffloadingCleanupPayload null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

