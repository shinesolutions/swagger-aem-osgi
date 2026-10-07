# OrgApacheFelixHttpSslfilterSslFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SslForwardHeader** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SslForwardValue** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SslForwardCertHeader** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RewriteAbsoluteUrls** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheFelixHttpSslfilterSslFilterProperties = Initialize-PSOpenAPIToolsOrgApacheFelixHttpSslfilterSslFilterProperties  -SslForwardHeader null `
 -SslForwardValue null `
 -SslForwardCertHeader null `
 -RewriteAbsoluteUrls null
```

- Convert the resource to JSON
```powershell
$OrgApacheFelixHttpSslfilterSslFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

