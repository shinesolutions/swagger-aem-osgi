# ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DmreplicateonmodifyEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DmreplicateonmodifyForcesyncdeletes** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties = Initialize-PSOpenAPIToolsComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties  -DmreplicateonmodifyEnabled null `
 -DmreplicateonmodifyForcesyncdeletes null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

