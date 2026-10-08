# OrgApacheSlingServletsPostImplSlingPostServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServletPostDateFormats** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ServletPostNodeNameHints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ServletPostNodeNameMaxLength** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ServletPostCheckinNewVersionableNodes** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServletPostAutoCheckout** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServletPostAutoCheckin** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServletPostIgnorePattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingServletsPostImplSlingPostServletProperties = Initialize-PSOpenAPIToolsOrgApacheSlingServletsPostImplSlingPostServletProperties  -ServletPostDateFormats null `
 -ServletPostNodeNameHints null `
 -ServletPostNodeNameMaxLength null `
 -ServletPostCheckinNewVersionableNodes null `
 -ServletPostAutoCheckout null `
 -ServletPostAutoCheckin null `
 -ServletPostIgnorePattern null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingServletsPostImplSlingPostServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

