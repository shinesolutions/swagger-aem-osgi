# OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ManagerRoot** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HttpServiceFilter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultRender** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Realm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Username** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Category** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Locale** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Loglevel** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**Plugins** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties = Initialize-PSOpenAPIToolsOrgApacheFelixWebconsoleInternalServletOsgiManagerProperties  -ManagerRoot null `
 -HttpServiceFilter null `
 -DefaultRender null `
 -Realm null `
 -Username null `
 -Password null `
 -Category null `
 -Locale null `
 -Loglevel null `
 -Plugins null
```

- Convert the resource to JSON
```powershell
$OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

