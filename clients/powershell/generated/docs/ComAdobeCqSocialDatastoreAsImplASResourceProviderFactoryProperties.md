# ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CacheOn** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ConcurrencyLevel** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheStartSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheTtl** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TimeLimit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties  -VersionId null `
 -CacheOn null `
 -ConcurrencyLevel null `
 -CacheStartSize null `
 -CacheTtl null `
 -CacheSize null `
 -TimeLimit null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

