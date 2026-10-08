# ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FieldWhitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SitePathFilters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SitePackageGroup** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties  -FieldWhitelist null `
 -SitePathFilters null `
 -SitePackageGroup null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

