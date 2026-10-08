# ComAdobeCqDeserfwImplDeserializationFirewallImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FirewallDeserializationWhitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**FirewallDeserializationBlacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**FirewallDeserializationDiagnostics** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqDeserfwImplDeserializationFirewallImplProperties = Initialize-PSOpenAPIToolsComAdobeCqDeserfwImplDeserializationFirewallImplProperties  -FirewallDeserializationWhitelist null `
 -FirewallDeserializationBlacklist null `
 -FirewallDeserializationDiagnostics null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqDeserfwImplDeserializationFirewallImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

