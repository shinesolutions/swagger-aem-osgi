# ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServiceRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**KeypairId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**KeypairAlias** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CdnrewriterAttributes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CdnRewriterDistributionDomain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties = Initialize-PSOpenAPIToolsComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties  -ServiceRanking null `
 -KeypairId null `
 -KeypairAlias null `
 -CdnrewriterAttributes null `
 -CdnRewriterDistributionDomain null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

