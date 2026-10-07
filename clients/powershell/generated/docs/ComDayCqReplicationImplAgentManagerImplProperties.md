# ComDayCqReplicationImplAgentManagerImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JobTopics** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ServiceUserTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AgentProviderTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqReplicationImplAgentManagerImplProperties = Initialize-PSOpenAPIToolsComDayCqReplicationImplAgentManagerImplProperties  -JobTopics null `
 -ServiceUserTarget null `
 -AgentProviderTarget null
```

- Convert the resource to JSON
```powershell
$ComDayCqReplicationImplAgentManagerImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

