# OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Extensions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**MinDurationMs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxDurationMs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactLogFormat** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties = Initialize-PSOpenAPIToolsOrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties  -Extensions null `
 -MinDurationMs null `
 -MaxDurationMs null `
 -CompactLogFormat null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

