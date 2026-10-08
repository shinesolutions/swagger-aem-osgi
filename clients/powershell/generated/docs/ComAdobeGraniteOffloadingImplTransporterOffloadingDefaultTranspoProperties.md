# ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultTransportAgentToWorkerPrefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultTransportAgentToMasterPrefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultTransportInputPackage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultTransportOutputPackage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultTransportReplicationSynchronous** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DefaultTransportContentpackage** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OffloadingTransporterDefaultEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties = Initialize-PSOpenAPIToolsComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties  -DefaultTransportAgentToWorkerPrefix null `
 -DefaultTransportAgentToMasterPrefix null `
 -DefaultTransportInputPackage null `
 -DefaultTransportOutputPackage null `
 -DefaultTransportReplicationSynchronous null `
 -DefaultTransportContentpackage null `
 -OffloadingTransporterDefaultEnabled null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

