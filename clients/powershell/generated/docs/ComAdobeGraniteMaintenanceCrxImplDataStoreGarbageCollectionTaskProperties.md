# ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GraniteMaintenanceMandatory** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**JobTopics** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties = Initialize-PSOpenAPIToolsComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties  -GraniteMaintenanceMandatory null `
 -JobTopics null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

