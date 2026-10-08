# ComDayCqReportingImplCacheCacheImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RepcacheEnable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**RepcacheTtl** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RepcacheMax** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqReportingImplCacheCacheImplProperties = Initialize-PSOpenAPIToolsComDayCqReportingImplCacheCacheImplProperties  -RepcacheEnable null `
 -RepcacheTtl null `
 -RepcacheMax null
```

- Convert the resource to JSON
```powershell
$ComDayCqReportingImplCacheCacheImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

