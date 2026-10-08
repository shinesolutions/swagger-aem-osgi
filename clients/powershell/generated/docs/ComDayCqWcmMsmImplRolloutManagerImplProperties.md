# ComDayCqWcmMsmImplRolloutManagerImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventFilter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RolloutmgrExcludedpropsDefault** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**RolloutmgrExcludedparagraphpropsDefault** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**RolloutmgrExcludednodetypesDefault** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**RolloutmgrThreadpoolMaxsize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RolloutmgrThreadpoolMaxshutdowntime** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RolloutmgrThreadpoolPriority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**RolloutmgrCommitSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RolloutmgrConflicthandlingEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmMsmImplRolloutManagerImplProperties = Initialize-PSOpenAPIToolsComDayCqWcmMsmImplRolloutManagerImplProperties  -EventFilter null `
 -RolloutmgrExcludedpropsDefault null `
 -RolloutmgrExcludedparagraphpropsDefault null `
 -RolloutmgrExcludednodetypesDefault null `
 -RolloutmgrThreadpoolMaxsize null `
 -RolloutmgrThreadpoolMaxshutdowntime null `
 -RolloutmgrThreadpoolPriority null `
 -RolloutmgrCommitSize null `
 -RolloutmgrConflicthandlingEnabled null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmMsmImplRolloutManagerImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

