# ComAdobeCqSocialSyncImplUserSyncListenerImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Nodetypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Ignorableprops** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Ignorablenodes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Distfolders** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialSyncImplUserSyncListenerImplProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialSyncImplUserSyncListenerImplProperties  -Nodetypes null `
 -Ignorableprops null `
 -Ignorablenodes null `
 -Enabled null `
 -Distfolders null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialSyncImplUserSyncListenerImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

