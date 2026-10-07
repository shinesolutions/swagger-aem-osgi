# ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ComAdobeCqDamMacSyncDamsyncservicePlatform** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties = Initialize-PSOpenAPIToolsComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties  -ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths null `
 -ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions null `
 -ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs null `
 -ComAdobeCqDamMacSyncDamsyncservicePlatform null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

