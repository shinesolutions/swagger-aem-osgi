# ComDayCqWcmCoreImplWCMDebugFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WcmdbgfilterEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**WcmdbgfilterJspDebug** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmCoreImplWCMDebugFilterProperties = Initialize-PSOpenAPIToolsComDayCqWcmCoreImplWCMDebugFilterProperties  -WcmdbgfilterEnabled null `
 -WcmdbgfilterJspDebug null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmCoreImplWCMDebugFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

