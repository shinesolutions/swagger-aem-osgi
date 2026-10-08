# OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mongouri** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**db** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**socket_keep_alive** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cache** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**node_cache_percentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**prev_doc_cache_percentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**children_cache_percentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**diff_cache_percentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cache_segment_count** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cache_stack_move_distance** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**blob_cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**persistent_cache** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**journal_cache** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**custom_blob_store** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**journal_gc_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**journal_gc_max_age** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**prefetch_external_changes** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**role** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**version_gc_max_age_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**version_gc_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**version_gc_time_limit_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**blob_gc_max_age_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**blob_track_snapshot_interval_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**repository_home** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**max_replication_lag_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**document_store_type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**bundling_disabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**update_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**persistent_cache_includes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**lease_check_mode** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties import OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties from a JSON string
org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_instance = OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.to_json()

# convert the object into a dict
org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_dict = org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties from a dict
org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_from_dict = OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.from_dict(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


