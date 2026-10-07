# ComAdobeGraniteSecurityUserUserPropertiesServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdapterCondition** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**GraniteUserpropertiesNodetypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**GraniteUserpropertiesResourcetypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteSecurityUserUserPropertiesServiceProperties = Initialize-PSOpenAPIToolsComAdobeGraniteSecurityUserUserPropertiesServiceProperties  -AdapterCondition null `
 -GraniteUserpropertiesNodetypes null `
 -GraniteUserpropertiesResourcetypes null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteSecurityUserUserPropertiesServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

