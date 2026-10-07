# ComDayCqDamIdsImplIDSPoolManagerImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxErrorsToBlacklist** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RetryIntervalToWhitelist** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ConnectTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SocketTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ProcessLabel** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ConnectionUseMax** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamIdsImplIDSPoolManagerImplProperties = Initialize-PSOpenAPIToolsComDayCqDamIdsImplIDSPoolManagerImplProperties  -MaxErrorsToBlacklist null `
 -RetryIntervalToWhitelist null `
 -ConnectTimeout null `
 -SocketTimeout null `
 -ProcessLabel null `
 -ConnectionUseMax null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamIdsImplIDSPoolManagerImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

