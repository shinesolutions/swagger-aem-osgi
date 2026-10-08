# ComAdobeCqAccountImplAccountManagementServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqAccountmanagerConfigInformnewaccountMail** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqAccountmanagerConfigInformnewpwdMail** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqAccountImplAccountManagementServletProperties = Initialize-PSOpenAPIToolsComAdobeCqAccountImplAccountManagementServletProperties  -CqAccountmanagerConfigInformnewaccountMail null `
 -CqAccountmanagerConfigInformnewpwdMail null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqAccountImplAccountManagementServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

