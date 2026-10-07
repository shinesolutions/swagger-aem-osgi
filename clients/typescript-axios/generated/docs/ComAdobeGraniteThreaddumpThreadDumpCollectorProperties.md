# ComAdobeGraniteThreaddumpThreadDumpCollectorProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**scheduler_runOn** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**granite_threaddump_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**granite_threaddump_dumpsPerFile** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**granite_threaddump_enableGzipCompression** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**granite_threaddump_enableDirectoriesCompression** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**granite_threaddump_enableJStack** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**granite_threaddump_maxBackupDays** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**granite_threaddump_backupCleanTrigger** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ComAdobeGraniteThreaddumpThreadDumpCollectorProperties } from './api';

const instance: ComAdobeGraniteThreaddumpThreadDumpCollectorProperties = {
    scheduler_period,
    scheduler_runOn,
    granite_threaddump_enabled,
    granite_threaddump_dumpsPerFile,
    granite_threaddump_enableGzipCompression,
    granite_threaddump_enableDirectoriesCompression,
    granite_threaddump_enableJStack,
    granite_threaddump_maxBackupDays,
    granite_threaddump_backupCleanTrigger,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
