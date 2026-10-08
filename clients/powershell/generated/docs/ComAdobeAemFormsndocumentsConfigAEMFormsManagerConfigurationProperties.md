# ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FormsManagerConfigIncludeOOTBTemplates** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**FormsManagerConfigIncludeDeprecatedTemplates** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties = Initialize-PSOpenAPIToolsComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties  -FormsManagerConfigIncludeOOTBTemplates null `
 -FormsManagerConfigIncludeDeprecatedTemplates null
```

- Convert the resource to JSON
```powershell
$ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

