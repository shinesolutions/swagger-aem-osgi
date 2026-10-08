# OrgApacheAriesJmxFrameworkStateConfigInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarPid** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Properties** | [**OrgApacheAriesJmxFrameworkStateConfigProperties**](OrgApacheAriesJmxFrameworkStateConfigProperties.md) |  | [optional] 
**BundleLocation** | **String** |  | [optional] 
**ServiceLocation** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheAriesJmxFrameworkStateConfigInfo = Initialize-PSOpenAPIToolsOrgApacheAriesJmxFrameworkStateConfigInfo  -VarPid null `
 -Title null `
 -Description null `
 -Properties null `
 -BundleLocation null `
 -ServiceLocation null
```

- Convert the resource to JSON
```powershell
$OrgApacheAriesJmxFrameworkStateConfigInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

