# ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PortalOutboxes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**DraftDataService** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DraftMetadataService** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SubmitDataService** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SubmitMetadataService** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PendingSignDataService** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PendingSignMetadataService** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties = Initialize-PSOpenAPIToolsComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties  -PortalOutboxes null `
 -DraftDataService null `
 -DraftMetadataService null `
 -SubmitDataService null `
 -SubmitMetadataService null `
 -PendingSignDataService null `
 -PendingSignMetadataService null
```

- Convert the resource to JSON
```powershell
$ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

