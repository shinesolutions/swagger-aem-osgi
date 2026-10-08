# OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarPid** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Properties** | [**OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties**](OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo = Initialize-PSOpenAPIToolsOrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo  -VarPid null `
 -Title null `
 -Description null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

