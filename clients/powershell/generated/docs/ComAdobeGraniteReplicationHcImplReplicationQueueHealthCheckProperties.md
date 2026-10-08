# ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NumberOfRetriesAllowed** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties = Initialize-PSOpenAPIToolsComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties  -NumberOfRetriesAllowed null `
 -HcTags null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

