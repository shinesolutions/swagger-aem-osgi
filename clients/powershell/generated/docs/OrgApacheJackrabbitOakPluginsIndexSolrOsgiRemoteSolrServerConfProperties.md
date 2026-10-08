# OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SolrHttpUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SolrZkHost** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SolrCollection** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SolrSocketTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SolrConnectionTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SolrShardsNo** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SolrReplicationFactor** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SolrConfDir** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties  -SolrHttpUrl null `
 -SolrZkHost null `
 -SolrCollection null `
 -SolrSocketTimeout null `
 -SolrConnectionTimeout null `
 -SolrShardsNo null `
 -SolrReplicationFactor null `
 -SolrConfDir null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

