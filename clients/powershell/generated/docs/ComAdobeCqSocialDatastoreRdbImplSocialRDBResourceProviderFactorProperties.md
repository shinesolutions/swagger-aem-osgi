# ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SolrZkTimeout** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SolrCommit** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CacheOn** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ConcurrencyLevel** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheStartSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheTtl** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties  -SolrZkTimeout null `
 -SolrCommit null `
 -CacheOn null `
 -ConcurrencyLevel null `
 -CacheStartSize null `
 -CacheTtl null `
 -CacheSize null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

