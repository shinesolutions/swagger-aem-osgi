# ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SchedulerPeriod** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SchedulerConcurrent** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GoodLinkTestInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BadLinkTestInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**LinkUnusedInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ConnectionTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties = Initialize-PSOpenAPIToolsComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties  -SchedulerPeriod null `
 -SchedulerConcurrent null `
 -GoodLinkTestInterval null `
 -BadLinkTestInterval null `
 -LinkUnusedInterval null `
 -ConnectionTimeout null
```

- Convert the resource to JSON
```powershell
$ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

