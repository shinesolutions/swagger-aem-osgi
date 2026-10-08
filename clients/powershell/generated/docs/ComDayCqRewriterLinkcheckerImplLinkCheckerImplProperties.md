# ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SchedulerPeriod** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SchedulerConcurrent** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServiceBadLinkToleranceInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ServiceCheckOverridePatterns** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ServiceCacheBrokenInternalLinks** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServiceSpecialLinkPrefix** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ServiceSpecialLinkPatterns** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties = Initialize-PSOpenAPIToolsComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties  -SchedulerPeriod null `
 -SchedulerConcurrent null `
 -ServiceBadLinkToleranceInterval null `
 -ServiceCheckOverridePatterns null `
 -ServiceCacheBrokenInternalLinks null `
 -ServiceSpecialLinkPrefix null `
 -ServiceSpecialLinkPatterns null
```

- Convert the resource to JSON
```powershell
$ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

