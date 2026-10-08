# ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Group2memberRelationshipOutgoing** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Group2memberExcludedOutgoing** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Group2memberRelationshipIncoming** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Group2memberExcludedIncoming** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties = Initialize-PSOpenAPIToolsComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties  -Group2memberRelationshipOutgoing null `
 -Group2memberExcludedOutgoing null `
 -Group2memberRelationshipIncoming null `
 -Group2memberExcludedIncoming null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

