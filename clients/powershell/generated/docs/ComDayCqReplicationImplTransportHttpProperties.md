# ComDayCqReplicationImplTransportHttpProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DisabledCipherSuites** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**EnabledCipherSuites** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqReplicationImplTransportHttpProperties = Initialize-PSOpenAPIToolsComDayCqReplicationImplTransportHttpProperties  -DisabledCipherSuites null `
 -EnabledCipherSuites null
```

- Convert the resource to JSON
```powershell
$ComDayCqReplicationImplTransportHttpProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

