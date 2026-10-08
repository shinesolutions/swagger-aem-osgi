# ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IndexingCriticalThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**IndexingWarnThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties = Initialize-PSOpenAPIToolsComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties  -IndexingCriticalThreshold null `
 -IndexingWarnThreshold null `
 -HcTags null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

