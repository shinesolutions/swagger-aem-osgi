# ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SchedulerPeriod** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SchedulerRunOn** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**GraniteThreaddumpEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteThreaddumpDumpsPerFile** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GraniteThreaddumpEnableGzipCompression** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteThreaddumpEnableDirectoriesCompression** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteThreaddumpEnableJStack** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteThreaddumpMaxBackupDays** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GraniteThreaddumpBackupCleanTrigger** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteThreaddumpThreadDumpCollectorProperties = Initialize-PSOpenAPIToolsComAdobeGraniteThreaddumpThreadDumpCollectorProperties  -SchedulerPeriod null `
 -SchedulerRunOn null `
 -GraniteThreaddumpEnabled null `
 -GraniteThreaddumpDumpsPerFile null `
 -GraniteThreaddumpEnableGzipCompression null `
 -GraniteThreaddumpEnableDirectoriesCompression null `
 -GraniteThreaddumpEnableJStack null `
 -GraniteThreaddumpMaxBackupDays null `
 -GraniteThreaddumpBackupCleanTrigger null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteThreaddumpThreadDumpCollectorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

