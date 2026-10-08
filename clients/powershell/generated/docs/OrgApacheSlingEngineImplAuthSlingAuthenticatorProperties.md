# OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OsgiHttpWhiteboardContextSelect** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OsgiHttpWhiteboardListener** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthSudoCookie** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthSudoParameter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthAnnonymous** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SlingAuthRequirements** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SlingAuthAnonymousUser** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SlingAuthAnonymousPassword** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthHttp** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**AuthHttpRealm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthUriSuffix** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties = Initialize-PSOpenAPIToolsOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties  -OsgiHttpWhiteboardContextSelect null `
 -OsgiHttpWhiteboardListener null `
 -AuthSudoCookie null `
 -AuthSudoParameter null `
 -AuthAnnonymous null `
 -SlingAuthRequirements null `
 -SlingAuthAnonymousUser null `
 -SlingAuthAnonymousPassword null `
 -AuthHttp null `
 -AuthHttpRealm null `
 -AuthUriSuffix null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

