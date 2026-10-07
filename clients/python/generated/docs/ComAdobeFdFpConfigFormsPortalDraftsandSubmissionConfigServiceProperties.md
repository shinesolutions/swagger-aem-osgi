# ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portal_outboxes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**draft_data_service** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**draft_metadata_service** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**submit_data_service** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**submit_metadata_service** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**pending_sign_data_service** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**pending_sign_metadata_service** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties import ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties from a JSON string
com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_instance = ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.to_json())

# convert the object into a dict
com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_dict = com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_instance.to_dict()
# create an instance of ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties from a dict
com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_from_dict = ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.from_dict(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


