# ComDayCqPollingImporterImplManagedPollConfigImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Reference** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Source** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Login** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqPollingImporterImplManagedPollConfigImplProperties = Initialize-PSOpenAPIToolsComDayCqPollingImporterImplManagedPollConfigImplProperties  -Id null `
 -Enabled null `
 -Reference null `
 -Interval null `
 -Expression null `
 -Source null `
 -Target null `
 -Login null `
 -Password null
```

- Convert the resource to JSON
```powershell
$ComDayCqPollingImporterImplManagedPollConfigImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

