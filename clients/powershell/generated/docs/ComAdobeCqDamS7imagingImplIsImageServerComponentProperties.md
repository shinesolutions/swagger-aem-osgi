# ComAdobeCqDamS7imagingImplIsImageServerComponentProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TcpPort** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AllowRemoteAccess** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**MaxRenderRgnPixels** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxMessageSize** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RandomAccessUrlTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**WorkerThreads** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqDamS7imagingImplIsImageServerComponentProperties = Initialize-PSOpenAPIToolsComAdobeCqDamS7imagingImplIsImageServerComponentProperties  -TcpPort null `
 -AllowRemoteAccess null `
 -MaxRenderRgnPixels null `
 -MaxMessageSize null `
 -RandomAccessUrlTimeout null `
 -WorkerThreads null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqDamS7imagingImplIsImageServerComponentProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

