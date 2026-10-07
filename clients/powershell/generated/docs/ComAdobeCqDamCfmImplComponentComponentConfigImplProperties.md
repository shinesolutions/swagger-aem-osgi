# ComAdobeCqDamCfmImplComponentComponentConfigImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DamCfmComponentResourceType** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DamCfmComponentFileReferenceProp** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DamCfmComponentElementsProp** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DamCfmComponentVariationProp** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqDamCfmImplComponentComponentConfigImplProperties = Initialize-PSOpenAPIToolsComAdobeCqDamCfmImplComponentComponentConfigImplProperties  -DamCfmComponentResourceType null `
 -DamCfmComponentFileReferenceProp null `
 -DamCfmComponentElementsProp null `
 -DamCfmComponentVariationProp null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqDamCfmImplComponentComponentConfigImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

