# SwaggerAemOsgiClient::ComAdobeGraniteThreaddumpThreadDumpCollectorProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**scheduler_run_on** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**granite_threaddump_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_threaddump_dumps_per_file** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**granite_threaddump_enable_gzip_compression** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_threaddump_enable_directories_compression** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_threaddump_enable_j_stack** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_threaddump_max_backup_days** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**granite_threaddump_backup_clean_trigger** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Code Sample

```ruby
require 'SwaggerAemOsgiClient'

instance = SwaggerAemOsgiClient::ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.new(scheduler_period: null,
                                 scheduler_run_on: null,
                                 granite_threaddump_enabled: null,
                                 granite_threaddump_dumps_per_file: null,
                                 granite_threaddump_enable_gzip_compression: null,
                                 granite_threaddump_enable_directories_compression: null,
                                 granite_threaddump_enable_j_stack: null,
                                 granite_threaddump_max_backup_days: null,
                                 granite_threaddump_backup_clean_trigger: null)
```


