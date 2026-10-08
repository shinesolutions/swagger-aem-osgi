# ComAdobeOctopusNcommBootstrapProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxConnections** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxRequests** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RequestTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RequestRetries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**LaunchTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeOctopusNcommBootstrapProperties = Initialize-PSOpenAPIToolsComAdobeOctopusNcommBootstrapProperties  -MaxConnections null `
 -MaxRequests null `
 -RequestTimeout null `
 -RequestRetries null `
 -LaunchTimeout null
```

- Convert the resource to JSON
```powershell
$ComAdobeOctopusNcommBootstrapProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

