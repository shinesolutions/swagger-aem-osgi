# ComAdobeGraniteInfocollectorInfoCollectorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GraniteInfocollectorIncludeThreadDumps** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteInfocollectorIncludeHeapDump** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteInfocollectorInfoCollectorProperties = Initialize-PSOpenAPIToolsComAdobeGraniteInfocollectorInfoCollectorProperties  -GraniteInfocollectorIncludeThreadDumps null `
 -GraniteInfocollectorIncludeHeapDump null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteInfocollectorInfoCollectorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

