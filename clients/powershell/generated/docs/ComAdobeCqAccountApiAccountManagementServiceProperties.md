# ComAdobeCqAccountApiAccountManagementServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqAccountmanagerTokenValidityPeriod** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqAccountmanagerConfigRequestnewaccountMail** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqAccountmanagerConfigRequestnewpwdMail** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqAccountApiAccountManagementServiceProperties = Initialize-PSOpenAPIToolsComAdobeCqAccountApiAccountManagementServiceProperties  -CqAccountmanagerTokenValidityPeriod null `
 -CqAccountmanagerConfigRequestnewaccountMail null `
 -CqAccountmanagerConfigRequestnewpwdMail null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqAccountApiAccountManagementServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

