# ComDayCqJcrclustersupportClusterStartLevelControllerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClusterLevelEnable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ClusterMasterLevel** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterSlaveLevel** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqJcrclustersupportClusterStartLevelControllerProperties = Initialize-PSOpenAPIToolsComDayCqJcrclustersupportClusterStartLevelControllerProperties  -ClusterLevelEnable null `
 -ClusterMasterLevel null `
 -ClusterSlaveLevel null
```

- Convert the resource to JSON
```powershell
$ComDayCqJcrclustersupportClusterStartLevelControllerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

