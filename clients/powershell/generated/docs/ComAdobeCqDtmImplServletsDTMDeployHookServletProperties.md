# ComAdobeCqDtmImplServletsDTMDeployHookServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DtmStagingIpWhitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**DtmProductionIpWhitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqDtmImplServletsDTMDeployHookServletProperties = Initialize-PSOpenAPIToolsComAdobeCqDtmImplServletsDTMDeployHookServletProperties  -DtmStagingIpWhitelist null `
 -DtmProductionIpWhitelist null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqDtmImplServletsDTMDeployHookServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

