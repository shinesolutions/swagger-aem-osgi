# ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdapterCondition** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TaskmanagerAdmingroups** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties = Initialize-PSOpenAPIToolsComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties  -AdapterCondition null `
 -TaskmanagerAdmingroups null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

