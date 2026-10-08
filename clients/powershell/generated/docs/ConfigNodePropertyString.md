# ConfigNodePropertyString
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | property name | [optional] 
**Optional** | **Boolean** | True if optional | [optional] 
**IsSet** | **Boolean** | True if property is set | [optional] 
**Type** | **Int32** | Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String) | [optional] 
**Value** | **String** | Property value | [optional] 
**Description** | **String** | Property description | [optional] 

## Examples

- Prepare the resource
```powershell
$ConfigNodePropertyString = Initialize-PSOpenAPIToolsConfigNodePropertyString  -Name null `
 -Optional null `
 -IsSet null `
 -Type null `
 -Value null `
 -Description null
```

- Convert the resource to JSON
```powershell
$ConfigNodePropertyString | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

