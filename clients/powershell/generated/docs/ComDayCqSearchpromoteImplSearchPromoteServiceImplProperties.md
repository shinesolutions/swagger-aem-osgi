# ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqSearchpromoteConfigurationServerUri** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqSearchpromoteConfigurationEnvironment** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ConnectionTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SocketTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties = Initialize-PSOpenAPIToolsComDayCqSearchpromoteImplSearchPromoteServiceImplProperties  -CqSearchpromoteConfigurationServerUri null `
 -CqSearchpromoteConfigurationEnvironment null `
 -ConnectionTimeout null `
 -SocketTimeout null
```

- Convert the resource to JSON
```powershell
$ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

