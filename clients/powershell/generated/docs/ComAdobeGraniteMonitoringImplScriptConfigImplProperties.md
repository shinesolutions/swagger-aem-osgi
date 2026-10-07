# ComAdobeGraniteMonitoringImplScriptConfigImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ScriptFilename** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ScriptDisplay** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ScriptPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ScriptPlatform** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Jmxdomain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteMonitoringImplScriptConfigImplProperties = Initialize-PSOpenAPIToolsComAdobeGraniteMonitoringImplScriptConfigImplProperties  -ScriptFilename null `
 -ScriptDisplay null `
 -ScriptPath null `
 -ScriptPlatform null `
 -Interval null `
 -Jmxdomain null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteMonitoringImplScriptConfigImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

