# OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**debug** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**local_index_dir** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**enable_open_index_async** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**thread_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**prefetch_index_files** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**extracted_text_cache_size_in_mb** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**extracted_text_cache_expiry_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**always_use_pre_extracted_cache** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**boolean_clause_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**enable_hybrid_indexing** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**hybrid_queue_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**disable_stored_index_definition** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**deleted_blobs_collection_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**prop_index_cleaner_interval_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**enable_single_blob_index_files** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties import OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties from a JSON string
org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_instance = OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.to_json())

# convert the object into a dict
org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_dict = org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties from a dict
org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_from_dict = OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.from_dict(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


