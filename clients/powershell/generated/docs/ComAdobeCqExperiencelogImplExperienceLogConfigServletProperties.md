# ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DisabledForGroups** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties = Initialize-PSOpenAPIToolsComAdobeCqExperiencelogImplExperienceLogConfigServletProperties  -Enabled null `
 -DisabledForGroups null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

