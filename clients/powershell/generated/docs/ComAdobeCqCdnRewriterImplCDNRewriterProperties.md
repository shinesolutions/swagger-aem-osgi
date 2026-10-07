# ComAdobeCqCdnRewriterImplCDNRewriterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServiceRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CdnrewriterAttributes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CdnRewriterDistributionDomain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqCdnRewriterImplCDNRewriterProperties = Initialize-PSOpenAPIToolsComAdobeCqCdnRewriterImplCDNRewriterProperties  -ServiceRanking null `
 -CdnrewriterAttributes null `
 -CdnRewriterDistributionDomain null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqCdnRewriterImplCDNRewriterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

