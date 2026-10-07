# ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxConnections** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxRequests** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RequestTimeout** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LogDir** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties = Initialize-PSOpenAPIToolsComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties  -MaxConnections null `
 -MaxRequests null `
 -RequestTimeout null `
 -LogDir null
```

- Convert the resource to JSON
```powershell
$ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

