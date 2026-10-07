# OrgApacheSlingEngineImplSlingMainServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SlingMaxCalls** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SlingMaxInclusions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SlingTraceAllow** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SlingMaxRecordRequests** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SlingStorePatternRequests** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SlingServerinfo** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SlingAdditionalResponseHeaders** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingEngineImplSlingMainServletProperties = Initialize-PSOpenAPIToolsOrgApacheSlingEngineImplSlingMainServletProperties  -SlingMaxCalls null `
 -SlingMaxInclusions null `
 -SlingTraceAllow null `
 -SlingMaxRecordRequests null `
 -SlingStorePatternRequests null `
 -SlingServerinfo null `
 -SlingAdditionalResponseHeaders null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingEngineImplSlingMainServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

