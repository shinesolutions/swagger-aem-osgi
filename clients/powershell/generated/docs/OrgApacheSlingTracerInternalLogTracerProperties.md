# OrgApacheSlingTracerInternalLogTracerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TracerSets** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServletEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**RecordingCacheSizeInMB** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RecordingCacheDurationInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RecordingCompressionEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GzipResponse** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingTracerInternalLogTracerProperties = Initialize-PSOpenAPIToolsOrgApacheSlingTracerInternalLogTracerProperties  -TracerSets null `
 -Enabled null `
 -ServletEnabled null `
 -RecordingCacheSizeInMB null `
 -RecordingCacheDurationInSecs null `
 -RecordingCompressionEnabled null `
 -GzipResponse null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingTracerInternalLogTracerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

