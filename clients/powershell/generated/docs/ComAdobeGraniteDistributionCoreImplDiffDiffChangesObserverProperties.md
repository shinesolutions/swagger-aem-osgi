# ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AgentName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DiffPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ObservedPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ServiceName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PropertyNames** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DistributionDelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ServiceUserTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties = Initialize-PSOpenAPIToolsComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties  -Enabled null `
 -AgentName null `
 -DiffPath null `
 -ObservedPath null `
 -ServiceName null `
 -PropertyNames null `
 -DistributionDelay null `
 -ServiceUserTarget null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

