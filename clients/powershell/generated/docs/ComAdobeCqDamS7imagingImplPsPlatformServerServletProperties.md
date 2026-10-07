# ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CacheEnable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CacheRootPaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CacheMaxSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheMaxEntries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties = Initialize-PSOpenAPIToolsComAdobeCqDamS7imagingImplPsPlatformServerServletProperties  -CacheEnable null `
 -CacheRootPaths null `
 -CacheMaxSize null `
 -CacheMaxEntries null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

