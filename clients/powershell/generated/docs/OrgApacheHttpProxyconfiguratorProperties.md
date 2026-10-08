# OrgApacheHttpProxyconfiguratorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProxyEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ProxyHost** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProxyPort** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ProxyUser** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProxyPassword** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProxyExceptions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheHttpProxyconfiguratorProperties = Initialize-PSOpenAPIToolsOrgApacheHttpProxyconfiguratorProperties  -ProxyEnabled null `
 -ProxyHost null `
 -ProxyPort null `
 -ProxyUser null `
 -ProxyPassword null `
 -ProxyExceptions null
```

- Convert the resource to JSON
```powershell
$OrgApacheHttpProxyconfiguratorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

