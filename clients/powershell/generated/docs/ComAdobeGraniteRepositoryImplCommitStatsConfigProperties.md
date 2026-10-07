# ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**IntervalSeconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CommitsPerIntervalThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxLocationLength** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxDetailsShown** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MinDetailsPercentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ThreadMatchers** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**MaxGreedyDepth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GreedyStackMatchers** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**StackFilters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**StackMatchers** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**StackCategorizers** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**StackShorteners** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteRepositoryImplCommitStatsConfigProperties = Initialize-PSOpenAPIToolsComAdobeGraniteRepositoryImplCommitStatsConfigProperties  -Enabled null `
 -IntervalSeconds null `
 -CommitsPerIntervalThreshold null `
 -MaxLocationLength null `
 -MaxDetailsShown null `
 -MinDetailsPercentage null `
 -ThreadMatchers null `
 -MaxGreedyDepth null `
 -GreedyStackMatchers null `
 -StackFilters null `
 -StackMatchers null `
 -StackCategorizers null `
 -StackShorteners null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteRepositoryImplCommitStatsConfigProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

