# ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PreserveHierarchyNodes** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**IgnoreVersioning** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ImportAcl** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SaveThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PreserveUserPaths** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PreserveUuid** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PreserveUuidNodetypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PreserveUuidSubtrees** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AutoCommit** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties = Initialize-PSOpenAPIToolsComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties  -PreserveHierarchyNodes null `
 -IgnoreVersioning null `
 -ImportAcl null `
 -SaveThreshold null `
 -PreserveUserPaths null `
 -PreserveUuid null `
 -PreserveUuidNodetypes null `
 -PreserveUuidSubtrees null `
 -AutoCommit null
```

- Convert the resource to JSON
```powershell
$ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

