# ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**DispatcherAddress** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DispatcherFilterAllowed** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**DispatcherFilterBlocked** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties = Initialize-PSOpenAPIToolsComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties  -HcTags null `
 -DispatcherAddress null `
 -DispatcherFilterAllowed null `
 -DispatcherFilterBlocked null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

