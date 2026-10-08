# ComAdobeCqSocialSyncImplDiffChangesObserverProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AgentName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DiffPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PropertyNames** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialSyncImplDiffChangesObserverProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialSyncImplDiffChangesObserverProperties  -Enabled null `
 -AgentName null `
 -DiffPath null `
 -PropertyNames null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialSyncImplDiffChangesObserverProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

