# ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqAnalyticsSitecatalystServiceDatacenterUrl** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Devhostnamepatterns** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ConnectionTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SocketTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties = Initialize-PSOpenAPIToolsComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties  -CqAnalyticsSitecatalystServiceDatacenterUrl null `
 -Devhostnamepatterns null `
 -ConnectionTimeout null `
 -SocketTimeout null
```

- Convert the resource to JSON
```powershell
$ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

