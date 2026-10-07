# ComDayCqReplicationImplReplicationReceiverImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReceiverTmpfileThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ReceiverPackagesUseInstall** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqReplicationImplReplicationReceiverImplProperties = Initialize-PSOpenAPIToolsComDayCqReplicationImplReplicationReceiverImplProperties  -ReceiverTmpfileThreshold null `
 -ReceiverPackagesUseInstall null
```

- Convert the resource to JSON
```powershell
$ComDayCqReplicationImplReplicationReceiverImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

