# OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HandlerSchemes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SlingJcrinstallFolderNameRegexp** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SlingJcrinstallFolderMaxDepth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SlingJcrinstallSearchPath** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SlingJcrinstallNewConfigPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SlingJcrinstallSignalPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SlingJcrinstallEnableWriteback** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties = Initialize-PSOpenAPIToolsOrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties  -HandlerSchemes null `
 -SlingJcrinstallFolderNameRegexp null `
 -SlingJcrinstallFolderMaxDepth null `
 -SlingJcrinstallSearchPath null `
 -SlingJcrinstallNewConfigPath null `
 -SlingJcrinstallSignalPath null `
 -SlingJcrinstallEnableWriteback null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

