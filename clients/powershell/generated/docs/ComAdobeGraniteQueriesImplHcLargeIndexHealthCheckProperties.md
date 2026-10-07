# ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LargeIndexCriticalThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**LargeIndexWarnThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties = Initialize-PSOpenAPIToolsComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties  -LargeIndexCriticalThreshold null `
 -LargeIndexWarnThreshold null `
 -HcTags null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

