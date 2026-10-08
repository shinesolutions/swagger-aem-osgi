# OrgApacheSlingModelsImplModelAdapterFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OsgiHttpWhiteboardListener** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OsgiHttpWhiteboardContextSelect** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxRecursionDepth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CleanupJobPeriod** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingModelsImplModelAdapterFactoryProperties = Initialize-PSOpenAPIToolsOrgApacheSlingModelsImplModelAdapterFactoryProperties  -OsgiHttpWhiteboardListener null `
 -OsgiHttpWhiteboardContextSelect null `
 -MaxRecursionDepth null `
 -CleanupJobPeriod null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingModelsImplModelAdapterFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

