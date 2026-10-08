# ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AccountLogins** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ConsoleLogins** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties = Initialize-PSOpenAPIToolsComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties  -HcTags null `
 -AccountLogins null `
 -ConsoleLogins null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

