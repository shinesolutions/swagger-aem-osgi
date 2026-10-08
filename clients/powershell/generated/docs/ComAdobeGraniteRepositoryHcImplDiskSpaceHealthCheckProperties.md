# ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**DiskSpaceWarnThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DiskSpaceErrorThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties = Initialize-PSOpenAPIToolsComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties  -HcTags null `
 -DiskSpaceWarnThreshold null `
 -DiskSpaceErrorThreshold null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

