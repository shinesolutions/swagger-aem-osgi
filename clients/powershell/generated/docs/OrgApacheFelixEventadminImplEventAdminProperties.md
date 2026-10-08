# OrgApacheFelixEventadminImplEventAdminProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgApacheFelixEventadminThreadPoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**OrgApacheFelixEventadminAsyncToSyncThreadRatio** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 
**OrgApacheFelixEventadminTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**OrgApacheFelixEventadminRequireTopic** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OrgApacheFelixEventadminIgnoreTimeout** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**OrgApacheFelixEventadminIgnoreTopic** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheFelixEventadminImplEventAdminProperties = Initialize-PSOpenAPIToolsOrgApacheFelixEventadminImplEventAdminProperties  -OrgApacheFelixEventadminThreadPoolSize null `
 -OrgApacheFelixEventadminAsyncToSyncThreadRatio null `
 -OrgApacheFelixEventadminTimeout null `
 -OrgApacheFelixEventadminRequireTopic null `
 -OrgApacheFelixEventadminIgnoreTimeout null `
 -OrgApacheFelixEventadminIgnoreTopic null
```

- Convert the resource to JSON
```powershell
$OrgApacheFelixEventadminImplEventAdminProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

