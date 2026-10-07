# OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WhitelistBypass** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**WhitelistBundlesRegexp** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties = Initialize-PSOpenAPIToolsOrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties  -WhitelistBypass null `
 -WhitelistBundlesRegexp null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

