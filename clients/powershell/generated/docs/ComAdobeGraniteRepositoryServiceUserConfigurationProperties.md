# ComAdobeGraniteRepositoryServiceUserConfigurationProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServiceRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ServiceusersSimpleSubjectPopulation** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServiceusersList** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteRepositoryServiceUserConfigurationProperties = Initialize-PSOpenAPIToolsComAdobeGraniteRepositoryServiceUserConfigurationProperties  -ServiceRanking null `
 -ServiceusersSimpleSubjectPopulation null `
 -ServiceusersList null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteRepositoryServiceUserConfigurationProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

