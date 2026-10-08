# ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReplicationContentUseFileStorage** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ReplicationContentMaxCommitAttempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties = Initialize-PSOpenAPIToolsComDayCqReplicationImplReplicationContentFactoryProviderImplProperties  -ReplicationContentUseFileStorage null `
 -ReplicationContentMaxCommitAttempts null
```

- Convert the resource to JSON
```powershell
$ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

