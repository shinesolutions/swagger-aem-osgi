# ComAdobeCqAuditPurgeDamProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AuditlogRuleName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuditlogRuleContentpath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuditlogRuleMinimumage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AuditlogRuleTypes** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqAuditPurgeDamProperties = Initialize-PSOpenAPIToolsComAdobeCqAuditPurgeDamProperties  -AuditlogRuleName null `
 -AuditlogRuleContentpath null `
 -AuditlogRuleMinimumage null `
 -AuditlogRuleTypes null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqAuditPurgeDamProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

