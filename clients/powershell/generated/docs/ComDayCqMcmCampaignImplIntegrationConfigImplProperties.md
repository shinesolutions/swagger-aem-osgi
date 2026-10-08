# ComDayCqMcmCampaignImplIntegrationConfigImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AemMcmCampaignFormConstraints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AemMcmCampaignPublicUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AemMcmCampaignRelaxedSSL** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqMcmCampaignImplIntegrationConfigImplProperties = Initialize-PSOpenAPIToolsComDayCqMcmCampaignImplIntegrationConfigImplProperties  -AemMcmCampaignFormConstraints null `
 -AemMcmCampaignPublicUrl null `
 -AemMcmCampaignRelaxedSSL null
```

- Convert the resource to JSON
```powershell
$ComDayCqMcmCampaignImplIntegrationConfigImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

