# ComAdobeCqSocialUserImplTransportHttpToPublisherProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AgentConfiguration** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ContextPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DisabledCipherSuites** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**EnabledCipherSuites** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialUserImplTransportHttpToPublisherProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialUserImplTransportHttpToPublisherProperties  -Enable null `
 -AgentConfiguration null `
 -ContextPath null `
 -DisabledCipherSuites null `
 -EnabledCipherSuites null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialUserImplTransportHttpToPublisherProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

