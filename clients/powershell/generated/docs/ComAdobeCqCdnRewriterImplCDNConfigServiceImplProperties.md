# ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CdnConfigDistributionDomain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CdnConfigEnableRewriting** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CdnConfigPathPrefixes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CdnConfigCdnttl** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CdnConfigApplicationProtocol** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties = Initialize-PSOpenAPIToolsComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties  -CdnConfigDistributionDomain null `
 -CdnConfigEnableRewriting null `
 -CdnConfigPathPrefixes null `
 -CdnConfigCdnttl null `
 -CdnConfigApplicationProtocol null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

