# ComDayCqPollingImporterImplPollingImporterImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ImporterMinInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ImporterUser** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ExcludePaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**IncludePaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqPollingImporterImplPollingImporterImplProperties = Initialize-PSOpenAPIToolsComDayCqPollingImporterImplPollingImporterImplProperties  -ImporterMinInterval null `
 -ImporterUser null `
 -ExcludePaths null `
 -IncludePaths null
```

- Convert the resource to JSON
```powershell
$ComDayCqPollingImporterImplPollingImporterImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

