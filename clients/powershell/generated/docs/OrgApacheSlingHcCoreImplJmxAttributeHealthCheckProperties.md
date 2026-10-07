# OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HcName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**HcMbeanName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MbeanName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AttributeName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AttributeValueConstraint** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties = Initialize-PSOpenAPIToolsOrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties  -HcName null `
 -HcTags null `
 -HcMbeanName null `
 -MbeanName null `
 -AttributeName null `
 -AttributeValueConstraint null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

