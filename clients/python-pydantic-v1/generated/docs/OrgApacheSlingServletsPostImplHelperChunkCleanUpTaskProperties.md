# OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**scheduler_concurrent** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**chunk_cleanup_age** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties import OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties from a JSON string
org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_instance = OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.to_json()

# convert the object into a dict
org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_dict = org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_instance.to_dict()
# create an instance of OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties from a dict
org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_from_dict = OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.from_dict(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


