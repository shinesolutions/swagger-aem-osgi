# ComAdobeCqAuditPurgeDamInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarPid** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Properties** | [**ComAdobeCqAuditPurgeDamProperties**](ComAdobeCqAuditPurgeDamProperties.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqAuditPurgeDamInfo = Initialize-PSOpenAPIToolsComAdobeCqAuditPurgeDamInfo  -VarPid null `
 -Title null `
 -Description null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqAuditPurgeDamInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

