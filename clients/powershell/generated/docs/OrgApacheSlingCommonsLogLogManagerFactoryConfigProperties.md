# OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgApacheSlingCommonsLogLevel** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**OrgApacheSlingCommonsLogFile** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingCommonsLogPattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingCommonsLogNames** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**OrgApacheSlingCommonsLogAdditiv** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties = Initialize-PSOpenAPIToolsOrgApacheSlingCommonsLogLogManagerFactoryConfigProperties  -OrgApacheSlingCommonsLogLevel null `
 -OrgApacheSlingCommonsLogFile null `
 -OrgApacheSlingCommonsLogPattern null `
 -OrgApacheSlingCommonsLogNames null `
 -OrgApacheSlingCommonsLogAdditiv null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

